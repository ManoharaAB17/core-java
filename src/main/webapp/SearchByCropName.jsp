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
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48"></a>

			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a href="index.jsp" class="btn btn-info">Home</a></li>
					&nbsp;&nbsp;
					<li class="nav-item"><a href="cropp" class="btn btn-info">Crop</a></li>
					&nbsp;&nbsp;
					<li class="nav-item"><a href="Search.jsp" class="btn btn-info">Search</a></li>
					&nbsp;&nbsp;
					<li class="nav-item"><a href="SearchByCropName.jsp"
						class="btn btn-info">SearchByName</a></li> &nbsp;&nbsp;

				</ul>
			</div>
		</div>
	</nav>

	<form action="seacrhByCropName" method="get">
		<h1>Search By Crop Name</h1>

		Search Crop Name : <input type="text" name="cropName" /><br> <input
			type="submit" value="Seacrh" />
    </form>
    <div>
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>Region</th>
				<th>Total Days</th>
			</tr>

			<c:forEach items="${list}" var="k">

				<tr>
					<td>${k.cropName}</td>
					<td>${k.type}</td>
					<td>${k.region}</td>
					<td>${k.totdays}</td>
				</tr>
			</c:forEach>


		</table>

	</div>


</body>
</html>