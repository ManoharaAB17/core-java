<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style type="text/css">
.fm {
	margin: auto;
	margin-top: 40px;
	border: 2px;
	heigth: 900px;
	width: 600px;
}
</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48"></a>

			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a href="index.jsp" class="btn btn-info">Home</a></li>
					&nbsp;&nbsp;
					<li class="nav-item"><a href="casino.jsp" class="btn btn-info">Casino
							Entry pass</a></li> &nbsp;&nbsp;
					<li class="nav-item"><a href="beach.jsp" class="btn btn-info">Beach</a>
					</li>
				</ul>
			</div>
		</div>
	</nav>
	<form class="fm" action="beach" method="post">
		<h1>Select food</h1>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name
				: </label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Enter Your Name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Location
				: </label> <input type="text" class="form-control" name="location"
				id="exampleFormControlInput1" placeholder="Enter location">
		</div>
				
		<label for="exampleFormControlInput1" class="form-label">Clean: </label> 
		<div class="form-check">
		
			<input class="form-check-input" type="radio" name="flexRadioDefault"
				id="flexRadioDefault1" value="true"> <label class="form-check-label"
				for="flexRadioDefault1"> Yes </label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="flexRadioDefault"
				id="flexRadioDefault2" value="false"> <label
				class="form-check-label" for="flexRadioDefault2"> No </label>
		</div>
		&nbsp;
		<div>
			<label for="exampleFormControlInput1" class="form-label">Select	Games</label> 
			 <select class="form-select" multiple aria-label="multiple select example" name="games">    
				<option value="Parasailing">Parasailing</option>
				<option value="Windsurfing">Windsurfing</option>
				<option value="Jet skiing">Jet skiing</option>
				<option value="Boat Ride : Banana Tube">Boat Ride : Banana Tube</option>
				<option value="Ringo Ride">Ringo Ride</option>
				<option value="Kayaking">Kayaking</option>
				<option value="Scuba Diving">Scuba Diving </option>
				<option value="Speed boats">Speed boats</option>
				<option value="River Rafting">River Rafting</option>
			</select>
		</div>
		<input type="submit" class="btn btn-success" value="Send">

	</form>
	
	

</body>
</html>