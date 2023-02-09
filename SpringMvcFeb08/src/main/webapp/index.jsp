<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="48"></a>
				
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a  href="index.jsp" class="btn btn-info">Home</a></li> &nbsp;&nbsp;					
						
					</ul>
				</div>
			</div>
		</nav>
 <form class="fm" action="bekary" method="post">
		<h1>Select food</h1>

		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Bekary Name
				: </label> <input type="text" class="form-control" name="name"
				id="exampleFormControlInput1" placeholder="Enter Bekary Name">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Owner Name 
				: </label> <input type="text" class="form-control" name="ownerName"
				id="exampleFormControlInput1" placeholder="Enter Owner Name ">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Owner Wife Name 
				: </label> <input type="text" class="form-control" name="wifeName"
				id="exampleFormControlInput1" placeholder="Enter Owner Wife Name ">
		</div>
				
		<label for="exampleFormControlInput1" class="form-label">Married : </label> 
		<div class="form-check">		
			<input class="form-check-input" type="radio"  name="married"	id="flexRadioDefault1" value="true"> 
			<label class="form-check-label" 	for="flexRadioDefault1"> Yes </label>
		</div>
		<div class="form-check">
			<input class="form-check-input" type="radio"  name="married" id="flexRadioDefault2" value="false"> 
			<label class="form-check-label" for="flexRadioDefault2"> No </label>
		</div>
		&nbsp;
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Famous For 
				: </label> <input type="textarea" class="form-control" name="famousFor"
				id="exampleFormControlInput1" placeholder="Enter Famous For ">
		</div>
		<div class="mb-3">
			<label for="exampleFormControlInput1" class="form-label">Since
				: </label> <input type="text" class="form-control" name="since"
				id="exampleFormControlInput1" placeholder="Since ">
		</div>
		
		<input type="submit" class="btn btn-success" value="Send">

	</form>
	

</body>
</html>