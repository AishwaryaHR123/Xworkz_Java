<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Information Servlet</title>
</head>
<body>
<h5>Person Information</h5>
<form  action="gun" method="post" onclick="return validateForm()" >
<p id="sNo" />
		<div>
			slNo: <input type="text" onchange="handleSlno()" 
				name="slNo" id="slNo" />
		</div>
<p id="fname" />
		<div>
			FName: <input type="text" onchange="handleFName()" 
				name="fName" id="fName" />
		</div>
		
<p id="lname" />
		<div>
			LName: <input type="text" onchange="handleLName()" 
				name="lName" id="lName" />
		</div>	
			
<p id="mname" />
		<div>
			FName: <input type="text" onchange="handleMName()" 
				name="mName" id="mName" />
		</div>
<p id="eMail" />
		<div>
			Email: <input type="email" name="email"
				onchange="handleEmail()" id="email" />
				
				
		<p id="gen" />
		<div>
			Gender: <input type="text" name="gender" onchange="handleGender()" id="gender" />
<p id="no" />
		<div>
			Contact No: <input type="text" name="contactNo"
				onchange="handlecontactNo()" id="contactNo" />
		</div>
		
<p id="areas" />
		<div>
			Area: <input type="text" onchange="handleArea()" 
				name="area" id="area" />
		</div>
		
		<p id="districts" />
		<div>
			District:<select name="district" id="district" onchange="handleDistrict()">
				<option>Choose....</option>
				<option>Davanagere</option>
				<option>Shivamogga</option>
				<option>Bangalore</option>
				<option>Mangalore</option>
				<option>Hassan</option>
			</select>
		</div>
		
<p id="states" />
		<div>
			State:<select name="state" id="state" onchange="handleState()">
				<option>Choose....</option>
				<option>Karnataka</option>
				<option>TamilNadu</option>
				<option>UttarPradesh</option>
			</select>
		</div>
<p id="code" />
		<div>
			PinCode: <input type="text"  name="pinCode"
				onchange="handleCode()" id="pinCode" />
		</div><input type="submit" class="btn btn-success"/>
</form>
<script type="text/javascript">
	function handleSlno() {
		var slNo = document.getElementById("slNo");
		console.log(slNo.value)
		var button = document.getElementById("button");
		if (slNo.value>0) {
			document.getElementById("sNo").innerHTML = "<span style='color:blue'>SlNo is valid</span>";
			button.removeAttribute("disabled");

		} else {
			document.getElementById("sNo").innerHTML = "<span style='color:red'>please enter Valid SlNo</span>";
			button.setAttribute("disabled", "");			
			return;
		}

	}
	function handleFName() {
		var fName = document.getElementById("fName");
		console.log(fName.value)
		var button = document.getElementById("button");
		if (fName.value.length>=3 && fName.value.length <=30) {
			document.getElementById("fname").innerHTML = "<span style='color:blue'>fName is valid</span>";
			button.removeAttribute("disabled");

		} else {
			document.getElementById("fname").innerHTML = "<span style='color:red'>please enter Valid fName</span>";
			button.setAttribute("disabled", "");			return;
		}

	}
	function handleLName() {
		var lName = document.getElementById("lName");
		console.log(lName.value)
		var button = document.getElementById("button");
		if (lName.value.length>=3 && lName.value.length <=30) {
			document.getElementById("lname").innerHTML = "<span style='color:blue'>lName is valid</span>";
			button.removeAttribute("disabled");

		} else {
			document.getElementById("lname").innerHTML = "<span style='color:red'>please enter Valid lName</span>";
			button.setAttribute("disabled", "");			return;
		}

	}
	function handleMName() {
		var mName = document.getElementById("mName");
		console.log(mName.value)
		var button = document.getElementById("button");
		if (mName.value.length>=3 && mName.value.length <=30) {
			document.getElementById("mname").innerHTML = "<span style='color:blue'>mName is valid</span>";
			button.removeAttribute("disabled");

		} else {
			document.getElementById("mname").innerHTML = "<span style='color:red'>please enter Valid mName</span>";
			button.setAttribute("disabled", "");			return;
		}

	}
		function handleEmail() {
			var email = document.getElementById("email");
			console.log(email.value)
			var button = document.getElementById("button");
			if (email.value.length >=3 && email.value.length <=30) {
				document.getElementById("eMail").innerHTML = "<span style='color:blue'>Email is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("eMail").innerHTML = "<span style='color:red'>please enter valid Email </span>";
				button.setAttribute("disabled", "");				return;

			}
		}
		
		
		function handleGender() {
			var gender = document.getElementById("gender");
			console.log(gender.value)
			var button = document.getElementById("button");
			if (gender.value.length>=3 && gender.value.length <=30) {
				document.getElementById("gen").innerHTML = "<span style='color:blue'>gender is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("gen").innerHTML = "<span style='color:red'>please enter Valid gender</span>";
				button.setAttribute("disabled", "");			return;
			}

		}
		
		function handlecontactNo() {
			var contactNo = document.getElementById("contactNo");
			console.log(contactNo.value)
			var button = document.getElementById("button");

			if (contactNo.value>1000000000 && contactNo.value<9999999999) {
				document.getElementById("no").innerHTML = "<span style='color:blue'>mobileNo is valid</span>";
				
				button.removeAttribute("disabled");
			} else {
				document.getElementById("no").innerHTML = "<span style='color:red'>please enter Valid mobileNo </span>";
				button.setAttribute("disabled", "");				return;

			}

		}
		
		function handleArea() {
			var area = document.getElementById("area");
			console.log(area.value)
			var button = document.getElementById("button");
			if (area.value.length>=3 && area.value.length <=30) {
				document.getElementById("areas").innerHTML = "<span style='color:blue'>area is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("areas").innerHTML = "<span style='color:red'>please enter Valid area</span>";
				button.setAttribute("disabled", "");			return;
			}

		}
		 
		 function handleDistrict() {
				var district = document.getElementById("district");
				console.log(district.value)
				var button = document.getElementById("button");

				if (district.value === 'Choose....') {
					document.getElementById("districts").innerHTML = "<span style='color:blue'>Please Select Valid Option</span>";
					button.setAttribute("disabled", "");
					

				} else {
					
					button.removeAttribute("disabled");
					return;

				}

			}
		 
		 function handleState() {
				var state = document.getElementById("state");
				console.log(state.value)
				var button = document.getElementById("button");

				if (state.value === 'Choose....') {
					document.getElementById("states").innerHTML = "<span style='color:blue'>Please Select Valid Option</span>";
					button.setAttribute("disabled", "");
					

				} else {
					
					button.removeAttribute("disabled");
					return;

				}

			}
		 
		 function handlePinCode() {
				var pinCode = document.getElementById("pinCode");
				console.log(pinCode.value)
				var button = document.getElementById("button");
				if (pinCode.value>0) {
					document.getElementById("code").innerHTML = "<span style='color:blue'>SlNo is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("code").innerHTML = "<span style='color:red'>please enter Valid SlNo</span>";
					button.setAttribute("disabled", "");			
					return;
				}

			}
		
		 function validateForm(){
				var fName = document.getElementById("fName").value;
				var lName = document.getElementById("lName").value;
				var mName = document.getElementById("mName").value;
				var email = document.getElementById("email").value;
				var gender = document.getElementById("gender").value;
				var contactNo = document.getElementById("contactNo").value;
				var area = document.getElementById("area").value;
				var district = document.getElementById("district").value;
				var state = document.getElementById("state").value;
				var pinCode = document.getElementById("pinCode").value;
				
				if (fName.length>=3 && fName.length <=30 && lName.length>=3 && lName.length <=30 && mName.length>=3 && mName.length <=30 && email.length>=3 && email.length<=30 && contactNo>1000000000 && contactNo<9999999999
						&& gender.length>=3 && gender.length <=30 && area.length>=3 && area.length <=30 &&
					&& district!=='Choose....' && state!=='Choose....' && pinCode>0)
					{
					document.getElementById("valid").innerHTML = "<span style='color:blue'>All fields are valid</span>";
					 button.removeAttribute("disabled");	
					 return true;
					}
				else {
	                document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter valid values in all fields</span>";
	                button.setAttribute("disabled", "disabled");
	                return false;
     }
		 }
		 
	</script>
</body>
</html>