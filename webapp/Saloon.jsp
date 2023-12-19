<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring mvc</title>
</head>
<body>
<h3>Saloon Appointment Form...</h3>	
		<form action="door" class="p-3 mb-2 bg-secondary text-white" method="post">
		Name: <input type="text" placeholder="Name" name="name"/><br><br>
		Date: <input type="date" placeholder="Date" name="date"/><br><br> 
		Time:<select name="time">
		   <option>choose.... </option>
		   <option>Morning</option>
		    <option>AfterNoon</option>
		    <option>Evening</option>           
		    </select><br><br>            
	    Email: <input type="text" placeholder="Email" name="email"/><br><br> 
	    MobileNo: <input type="text" placeholder="MobileNo" name="mobileNo"/><br><br> 
	    Location:<select name="location">
		   <option>choose.... </option>
		   <option>Rajajinagar</option>
		    <option>Indiranagar</option>
		    <option>Kengeri</option>           
		    <option>Hebbal</option>                        
		   </select><br><br>
		 Age: <select id="ageSelect" name="age">
    
             </select><br><br>
		   
		Purpose:<select name="purpose">
		   <option>choose.... </option>
		   <option>Facial</option>
		    <option>Cutting</option>
		    <option>Shaving</option>           
		    <option>pedicure</option>                        
		   </select><br><br>
		 Gender:
            <input type="radio" value="m" name="gender"/> Male
            <input type="radio" value="f" name="gender"/>Female
            <br>
            <br>
            
          Member:
            <input type="radio" value="y" name="member"/> yes
            <input type="radio" value="n" name="member" checked="checked"/>No
            <br>
            <br>
		Payment:<select name="payment">
		   <option>choose.... </option>
		   <option>Cash</option>
		    <option>CC</option>
		    <option>Debit</option>           
		    <option>UPI</option>
		    <option>Loan</option>                                                    
		   </select><br><br>
		   
		 <input type="submit" value="save" class="btn btn-success"/>
		  
		</form>
	<script>
		var ageSelect = document.getElementById("ageSelect");
		for (var i = 1; i <= 99; i++) {
			var option = document.createElement("option");
			option.value = i;
			option.text = i;
			ageSelect.add(option);
		}
	</script>
	<span style="color: green;">${msg}</span>
	
   

</body>
</html>