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
					<li class="nav-item"><a  href="index.jsp" class="btn btn-warning">Home</a></li> &nbsp;&nbsp;		
						<li class="nav-item"><a  href="ottd" class="btn btn-warning">OTT Platform</a></li> &nbsp;&nbsp;
						<li class="nav-item"><a  href="Search.jsp" class="btn btn-warning">Search</a></li> &nbsp;&nbsp;					
						<li class="nav-item"><a  href="SearchByPlatform.jsp" class="btn btn-warning">SearchByPlatform</a></li> &nbsp;&nbsp;					
						
				</ul>
			</div>
		</div>
	</nav>

	<form action="seacrhByCropName" method="get">
		<h1>Search By Platform</h1>

		Search Platform here : <input type="text" name="platform" /><br>
		 <input type="submit" value="Seacrh" />
	</form>
	
	<c:forEach  items="${message}" var="m">	</c:forEach>	<h5> <span style="colour:green">${message} </span></h5>
	
	
	<div>
		<table class="table">
			<tr>
				<th>ID</th>
				<th>Platform</th>
				<th>Show</th>
				<th>Language</th>
				<th>Cost</th>
				<th>Monthly Pack</th>
				<th>EDIT</th>
				<th> DELETE </th>
			</tr>

			<c:forEach items="${list}" var="k">
				<tr>
					<td>${k.id}</td>
					<td>${k.platform}</td>
					<td>${k.show}</td>
					<td>${k.language}</td>
					<td>${k.cost}</td>
					<td>${k.monthlyPack}</td>
					<td><a href="update?id=${k.id}"> Edit </a></td>
					<td><a href="delete?id=${k.id}"> Delete </a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>