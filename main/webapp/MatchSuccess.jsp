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
    <li class="breadcrumb-item active" aria-current="page"><a class="btn btn-primary" href="Match.jsp" role="button">Match</a></li>
    
  </ol>
</nav>
</nav>
	<h3>Match Info Saved Successfully......</h3>
	Tournament Name : ${pen.tournamentName} <br><br>
	Hosting Country : ${pen.hostingCountry} <br><br>
	Match Date : ${pen.matchDate} <br><br>
	Team1 : ${pen.team1} <br><br>
	Team2 : ${pen.team2} <br><br>
	Team1 Captain Name: ${pen.team1CaptainName} <br><br>
	Team2 Captain Name : ${pen.team2CaptainName} <br><br>
	Umpire Name : ${pen.umpireName} <br><br>
	Stadium Name : ${pen.stadiumName} <br><br>
	Third Umpire Name : ${pen.thirdUmpireName} <br><br>
	SatdiumCapacity: ${pen.stadiumCapacity} <br><br>

	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>