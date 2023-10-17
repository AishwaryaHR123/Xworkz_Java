<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>x-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
<h5 class="text-white h4"> X-workz</h5>

<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item active" aria-current="page"><a class="btn btn-primary" href="LoginSuccess.jsp" role="button">LoginSuccess</a></li>
  </ol>
</nav>
</nav>
    
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
		<form action="math" class="p-3 mb-2 bg-secondary text-white" method="post">
		<h3>  Welcome ${aishwarya.userId} </h3>
       <h3>enter the address</h3>
       <h3 style="color:green">${addressSuccess}</h3>
		
		<label>No: </label> <input type="text" placeholder="No" name="no"/><br><br>
		<label>Street: </label><input type="text" placeholder="Street" name="street"/><br><br>             
	    <label> City: </label>  <input type="text" placeholder="City" name="city"/><br><br> 
	    <label> State: </label>  <input type="text" placeholder="State" name="state"/><br><br> 
	    <label> Country: </label>  <input type="text" placeholder="Country" name="country"/><br><br> 
	    <input type="submit" value="save" class="btn btn-success"/>
	    
		</form>
</body>
</html>