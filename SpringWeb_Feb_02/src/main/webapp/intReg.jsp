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
					<li class="nav-item"><a href="index.jsp" class="btn btn-light">Home</a></li>
					&nbsp;&nbsp;

					<li class="nav-item"><a href="intReg.jsp"
						class="btn btn-light">Interview Registration</a></li>

				</ul>
			</div>
		</div>
	</nav>
	<form class="fm" action="inter" method="post">
		<h1>Select food</h1>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Name : </label>
			 <input type="text" class="form-control" name="name" id="exampleFormControlInput1" placeholder="Enter Your Name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Email : </label>
			 <input type="email" class="form-control" name="email" id="exampleFormControlInput1" placeholder="Enter Your Email">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Mobile number : </label>
			 <input type="number" class="form-control" name="number" id="exampleFormControlInput1" placeholder="Enter Your Number">
		</div>
		
		<div>
			<label for="exampleFormControlInput1" class="form-label">Select	Stream</label> 
			<select class="form-select" name="stream"	aria-label="Default select example">
				<!-- <option selected>Select Food Type</option> -->
				<option value="MCA">MCA</option>
				<option value="BCA">BCA</option>
				<option value="BEcs">BE-CS</option>
				<option value="BEmech">BE-MECH</option>
				<option value="BEec">BE-EC</option>
				<option value="BEcivil">BE-CIVIL</option>
			</select>
		</div>
		
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">PG Percentage</label>
			<input type="text" class="form-control" name="pgper" id="exampleFormControlInput1" placeholder="Percentage">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">UG Percentage</label>
			<input type="text" class="form-control" name="ugper" id="exampleFormControlInput1" placeholder="Percentage">
		</div>

		<input type="submit" class="btn btn-success" value="Send">

	</form>

</body>
</html>