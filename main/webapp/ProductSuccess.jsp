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
    <li class="breadcrumb-item active" aria-current="page"><a class="btn btn-primary" href="Product.jsp" role="button">Product</a></li>
    
  </ol>
</nav>
</nav>
	<h3>Product Saved Successfully....</h3>
	ProductName : ${dog.name} <br><br>
	Type: ${dog.type} <br><br>
	Price: ${dog.price} <br><br>
	Brand: ${dog.brand} <br><br>
	Quantity:${dog.quantity} <br><br>
	Desc: ${dog.desc}<br><br>
	<h5 style= "color:red"> Total: ${dog.price * dog.quantity} </h5>
	
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>