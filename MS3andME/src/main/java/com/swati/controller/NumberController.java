package com.swati.controller;

import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.swati.entity.NumberClass;

@Controller
public class NumberController {
	public static final int THREE=3;
	public static final int SEVEN=7;
	public static final int TWENTYONE=21;
	public static final String MS3_and_ME="MS3 and ME";
	public static final String ME="ME";
	public static final String MS3="MS3";

	@RequestMapping("/home")
	public String index() {
		return "home";
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.POST, produces = "application/json")
	public String result(@RequestParam("min") int min, @RequestParam("max") int max,
			HttpServletRequest request) {
		
		ArrayList<NumberClass> numClassList = new ArrayList<>();
		NumberClass numClass = null;

		for (int i = min; i <= max; i++) {

			if (i % TWENTYONE == 0) {
				
				numClass = new NumberClass();
				numClass.setNumber(i);
				numClass.setStringRepresentationOfNo(MS3_and_ME);
				numClassList.add(numClass);
				
			} else if (i % THREE == 0) {
				
				numClass = new NumberClass();
				numClass.setNumber(i);
				numClass.setStringRepresentationOfNo(ME);
				numClassList.add(numClass);
				
			} else if (i % SEVEN == 0) {
				
				numClass = new NumberClass();
				numClass.setNumber(i);
				numClass.setStringRepresentationOfNo(MS3);
				numClassList.add(numClass);
				
			} else {
				
				numClass = new NumberClass();
				numClass.setNumber(i);
				numClass.setStringRepresentationOfNo(String.valueOf(i));
				numClassList.add(numClass);
				
			}
		}
		request.getSession().setAttribute("numClassList", numClassList);
		
		ArrayList<NumberClass> numClassListCopy=(ArrayList<NumberClass>) numClassList.clone();
		Collections.reverse(numClassListCopy);
		request.getSession().setAttribute("numClassListReverse", numClassListCopy);
		
		return "result";
	}
	
	@RequestMapping(value = "/reverse", method = RequestMethod.POST, produces = "application/json")
	public String result(Model model,HttpServletRequest request) {
		
		request.setAttribute("reverseList", request.getSession().getAttribute("numClassListReverse"));
		return "reverse";
	}
}
