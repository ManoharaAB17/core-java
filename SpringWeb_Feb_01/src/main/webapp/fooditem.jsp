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

					<li class="nav-item"><a href="fooditem.jsp"
						class="btn btn-light">Get Food Item</a></li>

				</ul>
			</div>
		</div>
	</nav>
	<form class="fm" action="food" method="post">
		<h1>Select food</h1>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Food
				Name</label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Enter Your Food Name">
		</div>
		<div>
			<label for="exampleFormControlInput1" class="form-label">Select
				Food type</label> <select class="form-select" name="type"
				aria-label="Default select example">
				<!-- <option selected>Select Food Type</option> -->
				<option value="veg">Veg</option>
				<option value="nonveg">Non Veg</option>
				<option value="both">Both Veg And Non-Veg</option>
			</select>
		</div>
		<div>
			<!-- <label for="customRange2" class="form-label">Quantity</label> -->
			<label for="exampleFormControlInput1" class="form-label">Quantity</label>
			<input type="range" class="form-range" name="quantity" min="1"
				max="10" id="customRange2">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Price</label>
			<input type="text" class="form-control" name="price"
				id="exampleFormControlInput1" placeholder="Price">
		</div>

		<input type="submit" class="btn btn-success" value="Send">

	</form>

</body>
</html>