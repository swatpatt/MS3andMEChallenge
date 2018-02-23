package com.swati.entity;

public class NumberClass {
	private int number;
	private String stringRepresentationOfNo;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStringRepresentationOfNo() {
		return stringRepresentationOfNo;
	}

	public void setStringRepresentationOfNo(String stringRepresentationOfNo) {
		this.stringRepresentationOfNo = stringRepresentationOfNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((stringRepresentationOfNo == null) ? 0 : stringRepresentationOfNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberClass other = (NumberClass) obj;
		if (number != other.number)
			return false;
		if (stringRepresentationOfNo == null) {
			if (other.stringRepresentationOfNo != null)
				return false;
		} else if (!stringRepresentationOfNo.equals(other.stringRepresentationOfNo))
			return false;
		return true;
	}
}
