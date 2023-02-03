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

	<form class="fm" action="casino" method="post">
		<h1>Enter the Deatils</h1>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name
				: </label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Enter Your Name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Cursie
				: </label> <input type="text" class="form-control" name="cursie"
				id="exampleFormControlInput1" placeholder="Enter cursie name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Entry
				Fee : </label> <input type="text" class="form-control" name="entryFee"
				id="exampleFormControlInput1" placeholder="Entry Fee">
		</div>
		
		<label for="exampleFormControlInput1" class="form-label">Free Food: </label> 
		<div class="form-check">
		
			<input class="form-check-input" type="radio" name="freeFood"
				id="flexRadioDefault1" value="true"> <label class="form-check-label"
				for="flexRadioDefault1"> Yes </label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio" name="freeFood"
				id="flexRadioDefault2" value="false"> <label
				class="form-check-label" for="flexRadioDefault2"> No </label>
		</div>
		&nbsp;
		<input type="submit" class="btn btn-success" value="Send">

	</form>

</body>
</html>