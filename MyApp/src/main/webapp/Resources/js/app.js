/**
 * 
 */

 function validate(){
	 if(document.regForm.txtFirstName.value = ""){
		alert("First Name should be empty");
		return false;	 
	 }
	 
	 if((document.regForm.gender[0].checked == false) &&
	     (document.regForm.gender[1].checked == false))
	 {
		 alert("select your gender");
		 return false;
	 }
	 if(document.regForm.age.selectedIndex = 0){
		alert("Select your age group");
		return false;	 
	 }
	 if(document.regForm.terms.checked = flase){
		alert("Agree Terms and condition");
		return false;	 
	 }
	 
 }