/**
 * 
 */


 function validate(){
	 if(document.regForm1.txtFirstName.value == ""){
		alert("First Name should be empty");
		return false;	 
	 }
	 
	 if((document.regForm1.gender[0].checked == false) &&
	     (document.regForm1.gender[1].checked == false))
	 {
		 alert("select your gender");
		 return false;
	 }
	 
	 if(document.regForm1.age.selectedIndex == 0){
		 alert("Select your age group")
	 }
	 
	 if(document.regForm1.age.selectedIndex == 0){
		alert("Select your age group");
		return false;	 
	 }
	 if(document.regForm1.terms.checked == flase){
		alert("Agree Terms and condition");
		return false;	 
	 }
	 
 }