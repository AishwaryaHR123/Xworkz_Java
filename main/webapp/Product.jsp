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
		<h5 class="text-white h4">X-workz</h5>

		<nav aria-label="breadcrumb">
			<ol class="breadcrumb">
				<li class="breadcrumb-item"><a class="btn btn-primary"
					href="index.jsp" role="button">Home</a></li>
				<li class="breadcrumb-item active" aria-current="page"><a
					class="btn btn-primary" href="ProductSuccess.jsp" role="button">ProductSucces</a></li>
			</ol>
		</nav>
	</nav>
	<h3>Digital Form of Product!!!</h3>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

	<form action="laptop" class="p-3 mb-2 bg-secondary text-white"
		method="post">
		<p>
			<span id="valid" style="padding-left: 80px"></span>
		</p>
		<h4 style="color: red">${successMsg}</h4>
		<label>Name: </label> <input type="text" placeholder="name" name="name" onchange="handleName()" id="name"/><br> <br>
		 <label>Type:</label><select
			name="type" id="type" onchange="handleType()"> Type :
			<option>Choose....</option>
			<option>Jeans</option>
			<option>Kurti</option>
			<option>TShirt</option>
			<option>Shoes</option>
			<option>Jacket</option>
		</select> <br> <br> <label> Price: </label> <input type="number" placeholder="Price" id="price" onchange="handlePrice()" name="price"
			/><br> <br> 
			<label>Brand:</label> <select
			onchange="handleSelect()" id="select" name="brand"> Brand :
			<option>Choose....</option>
			<option>PeterEngland</option>
			<option>TokyoTalkies</option>
			<option>Puma</option>
			<option>adidas</option>
			<option>Levi's</option>
		</select> <br> <br> <label> Quantity: </label> <input type="number"
			placeholder="Quantity" name="quantity" id="quantity" onchange="handleQuantity()" /><br> <br> <label>
			Desc: </label> <input type="text" placeholder="Desc" name="desc" id="desc" onchange="handleDesc()"/><br>
		<br> <input type="submit" id="button" value="save"
			class="btn btn-success" />

	</form>
	<script type="text/javascript">
		function handlePrice(event) {
			var disabled = true;
			var price = document.getElementById("price");
			console.log(price.value)
			var button = document.getElementById("button");

			if (price.value > 2 && price.value < 50) {
				document.getElementById("valid").innerHTML = disabled;
				document.getElementById("valid").innerHTML = "<span style='color:blue'>price is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>please enter Valid price </span>";
				button.setAttribute("disabled", "");
				return;

			}

		}
		
		function handleType() {
			var disabled = true;
			var type = document.getElementById("type");
			console.log(type.value)
			var button = document.getElementById("button");

			if (type.value === 'Choose....') {
				document.getElementById("valid").innerHTML = disabled;

				document.getElementById("valid").innerHTML = "<span style='color:blue'>Please Select Valid Option</span>";
				button.setAttribute("disabled", "");

			} else {
				button.removeAttribute("disabled");

				return;

			}

		}
		
		function handleName(event) {
			var disabled = true;
			var name = document.getElementById("name");
			console.log(name.value)
			if (name.value.length>=3&& name.value.length < 8) {
				document.getElementById("valid").innerHTML = disabled;
				document.getElementById("valid").innerHTML = "<span style='color:blue'>name is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>please enter Valid name</span>";
				button.setAttribute("disabled", "");

				return;
			}

		}
		function handleQuantity(event) {
			var disabled = true;
			var quantity = document.getElementById("quantity");
			console.log(quantity.value)
			if (quantity.value>0 && quantity.value<50) {
				document.getElementById("valid").innerHTML = disabled;
				document.getElementById("valid").innerHTML = "<span style='color:blue'>Quantity is valid</span>";
				button.removeAttribute("disabled");
			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>Please Enter valid Quantity</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}
		function handleDesc(event) {
			var disabled = true;
			var desc = document.getElementById("desc");
			console.log(desc.value)
			if (desc.value.length>30) {
				document.getElementById("valid").innerHTML = disabled;
				document.getElementById("valid").innerHTML = "<span style='color:blue'>Description is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("valid").innerHTML = "<span style='color:red'>Description is Invalid</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}

		function handleSelect() {
			var disabled = true;
			var price = document.getElementById("select");
			console.log(price.value)
			var button = document.getElementById("button");

			if (price.value === 'Choose....') {
				document.getElementById("valid").innerHTML = disabled;

				document.getElementById("valid").innerHTML = "<span style='color:blue'>Please Select Valid Option</span>";
				button.setAttribute("disabled", "");

			} else {
				button.removeAttribute("disabled");

				return;

			}

		}
	</script>
</body>
</html>