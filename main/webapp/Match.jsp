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
					class="btn btn-primary" href="MatchSuccess.jsp" role="button">MatchSuccess</a></li>
			</ol>
		</nav>
	</nav>
	<h3>match Information!!!</h3>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>

	<form action="book" class="p-3 mb-2 bg-secondary text-white"
		method="post" onclick="return validateForm()">
		<p>
			<span id="valid" style="padding-left: 80px"></span>
		</p>
		 <p id="name"/><div>Tournament:<input type="text" placeholder="TournamentName" name="tournamentName" onchange="handleTournamentName()" id="tournamentName"/></div>
		 <p id="country"/><div> HostingCountry:<input type="text" placeholder="HostingCountry" name="hostingCountry" onchange="handleHostingCountry()" id="hostingCountry"/></div>
		<p id="date"/> <div>MatchDate: <input type="text" placeholder="MatchDate" name="matchDate" onchange="handleMatchDate()" id="matchDate"/></div>
		 <p id="teamone"/><div>Team1:<input type="text" placeholder="team1" name="team1" onchange="handleTeam1()" id="team1"/></div>
		 <p id="teamtwo"/> <div>Team2:<input type="text" placeholder="team2" name="team2" onchange="handleTeam2()" id="team2"/></div>
		<p id="team1Captain"/><div>Team1 Captain Name:<input type="text" placeholder="Team1 Captain Name" name="team1CaptainName" onchange="handleteam1CaptainName()" id="team1CaptainName"/></div>
		 <p id="team2Captain"/> <div>Team2 Captain Name:<input type="text" placeholder="Team2 Captain Name" name="team2CaptainName" onchange="handleteam2CaptainName()" id="team2CaptainName"/></div>
		<p id="umpire"/><div>Umpire Name:<input type="text" placeholder="Umpire Name" name="umpireName" onchange="handleumpireName()" id="umpireName"/></div>
		<p id="stadium"/><div>Stadium Name: <input type="text" placeholder="Stadium Name" name="stadiumName" onchange="handlestadiumName()" id="stadiumName"/></div>
		<p id="thirdUmpire"/><div>Third Umpire Name:<input type="text" placeholder="Third Umpire Name" name="thirdUmpireName" onchange="handlethirdUmpireName()" id="thirdUmpireName"/></div>
		<p id="stadiumCap"/> <div>Stadium Capacity: <input type="text" placeholder="Stadium Capacity" name="stadiumCapacity" onchange="handleStadiumCapacity()" id="stadiumCapacity"/></div> 
		 <input type="submit" id="button" value="save"
			class="btn btn-success" />

	</form>
	<script type="text/javascript">
		function handleStadiumCapacity(event) {
			var stadiumCapacity = document.getElementById("stadiumCapacity");
			console.log(stadiumCapacity.value)
			var button = document.getElementById("button");

			if (stadiumCapacity.value > 0 && stadiumCapacity.value < 50000) {
				document.getElementById("stadiumCap").innerHTML = "<span style='color:blue'>stadiumCapacity is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("stadiumCap").innerHTML = "<span style='color:red'>please enter Valid stadiumCapacity </span>";
				button.setAttribute("disabled", "");
				return;

			}

		}
	
		function handleTournamentName(event) {
			var tournamentName = document.getElementById("tournamentName");
			console.log(tournamentName.value)
			if (tournamentName.value.length>=3 && tournamentName.value.length <= 30) {
				document.getElementById("name").innerHTML = "<span style='color:blue'>tournamentName is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("name").innerHTML = "<span style='color:red'>please enter Valid tournamentName</span>";
				button.setAttribute("disabled", "");

				return;
			}

		}
			function handleHostingCountry(event) {
			var hostingCountry = document.getElementById("hostingCountry");
			console.log(hostingCountry.value)
			if (hostingCountry.value.length>=3 && hostingCountry.value.length<=30 ) {
				document.getElementById("country").innerHTML = "<span style='color:blue'>hostingCountry is valid</span>";
				button.removeAttribute("disabled");

			} else {
				document.getElementById("country").innerHTML = "<span style='color:red'>hostingCountry is Invalid</span>";
				button.setAttribute("disabled", "");
				return;
			}

		}
		
			function handleMatchDate(event) {
				var matchDate = document.getElementById("matchDate");
				console.log(matchDate.value)
				if (matchDate.value>0 && matchDate.value<=31) {
					document.getElementById("date").innerHTML = "<span style='color:blue'>matchDate is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("date").innerHTML = "<span style='color:red'>matchDate is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			
			function handleTeam1(event) {
				var team1 = document.getElementById("team1");
				console.log(team1.value)
				if (team1.value.length>=3 && team1.value.length<=30 ) {
					document.getElementById("teamone").innerHTML = "<span style='color:blue'>team1 is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("teamone").innerHTML = "<span style='color:red'>team1 is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			function handleTeam2(event) {
				var team2 = document.getElementById("team2");
				console.log(team2.value)
				if (team2.value.length>=3 && team2.value.length<=30 ) {
					document.getElementById("teamtwo").innerHTML = "<span style='color:blue'>team2 is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("teamtwo").innerHTML = "<span style='color:red'>team2 is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			
			function handleteam1CaptainName(event) {
				var team1CaptainName = document.getElementById("team1CaptainName");
				console.log(team1CaptainName.value)
				if (team1CaptainName.value.length>=3 && team1CaptainName.value.length<=30 ) {
					document.getElementById("team1Captain").innerHTML = "<span style='color:blue'>Team1 CaptainName is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("team1Captain").innerHTML = "<span style='color:red'>Team1 CaptainName  is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			
			function handleteam2CaptainName(event) {
				var team2CaptainName = document.getElementById("team2CaptainName");
				console.log(team2CaptainName.value)
				if (team2CaptainName.value.length>=3 && team2CaptainName.value.length<=30 ) {
					document.getElementById("team2Captain").innerHTML = "<span style='color:blue'>Team2 CaptainName is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("team2Captain").innerHTML = "<span style='color:red'>Team2 CaptainName is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			function handleumpireName(event) {
				var umpireName = document.getElementById("umpireName");
				console.log(umpireName.value)
				if (umpireName.value.length>=3 && umpireName.value.length<=30 ) {
					document.getElementById("umpire").innerHTML = "<span style='color:blue'>umpireName is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("umpire").innerHTML = "<span style='color:red'>umpireName is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			
			function handlestadiumName(event) {
				var stadiumName = document.getElementById("stadiumName");
				console.log(stadiumName.value)
				if (stadiumName.value.length>=3 && stadiumName.value.length<=30 ) {
					document.getElementById("stadium").innerHTML = "<span style='color:blue'>stadiumName is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("stadium").innerHTML = "<span style='color:red'>stadiumName is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			
			function handlethirdUmpireName(event) {
				var thirdUmpireName = document.getElementById("thirdUmpireName");
				console.log(thirdUmpireName.value)
				if (thirdUmpireName.value.length>=3 && thirdUmpireName.value.length<=30 ) {
					document.getElementById("thirdUmpire").innerHTML = "<span style='color:blue'>thirdUmpireName is valid</span>";
					button.removeAttribute("disabled");

				} else {
					document.getElementById("thirdUmpire").innerHTML = "<span style='color:red'>thirdUmpireName is Invalid</span>";
					button.setAttribute("disabled", "");
					return;
				}

			}
			   function validateForm() {
		            var tournamentName = document.getElementById("tournamentName").value;
		            var hostingCountry = document.getElementById("hostingCountry").value;
		            var matchDate = document.getElementById("matchDate").value;
		            var team1 = document.getElementById("team1").value;
		            var team2 = document.getElementById("team2").value;
		            var team1CaptainName = document.getElementById("team1CaptainName").value;
		            var team2CaptainName = document.getElementById("team2CaptainName").value;
		            var umpireName = document.getElementById("umpireName").value;
		            var stadiumName = document.getElementById("stadiumName").value;
		            var thirdUmpireName = document.getElementById("thirdUmpireName").value;
		            var stadiumCapacity = document.getElementById("stadiumCapacity").value;
		            var button = document.getElementById("button");
		            
		            if (tournamentName.length >= 3 && tournamentName.length <= 30 &&
		                hostingCountry.length > =3 && hostingCountry.length <= 30 &&
		                matchDate > 0 && matchDate <= 31 &&
		                team1.length > =3 && team1.length <= 30 &&
		                team2.length > =3 && team2.length <= 30 &&
		                team1CaptainName.length >=3 && team1CaptainName.length <= 30 &&
		                team2CaptainName.length >=3 && team2CaptainName.length <= 30 &&
		                umpireName.length >=3  && umpireName.length <= 30 &&
		                stadiumName.length >= 3 && stadiumName.length <= 30 &&
		                stadiumCapacity > =3 && stadiumCapacity < 50000) {
		                document.getElementById("valid").innerHTML = "<span style='color:blue'>All fields are valid</span>";
		                button.removeAttribute("disabled");
		            } else {
		                document.getElementById("valid").innerHTML = "<span style='color:red'>Please enter valid values in all fields</span>";
		                button.setAttribute("disabled", "");
		            }
		        }
	</script>
</body>
</html>