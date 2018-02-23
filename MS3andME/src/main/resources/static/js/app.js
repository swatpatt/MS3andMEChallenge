function validate() {
	var min = document.getElementById("min").value;
    var max = document.getElementById("max").value;
	if ( !min || !max || max<min || min>max) {
		alert('Please enter a valid range');
		return false;
	} else {
		return true;
	}
}