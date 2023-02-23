<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-WORKZ</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous">
	
</script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="48"></a>
				
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a  href="index.jsp" class="btn btn-info">Home</a></li> &nbsp;&nbsp;		
						<li class="nav-item"><a  href="airp" class="btn btn-info">AirDATA</a></li> &nbsp;&nbsp;		
						<li class="nav-item"><a  href="search" class="btn btn-info">Search</a></li> &nbsp;&nbsp;							
						
					</ul>
				</div>
			</div>
		</nav>


	<h1>Aeroplane Search</h1>
	<h3><span style="color:red;">${message} </span></h3> 
	
	<form action="search" method="get">

		Search By Id <input type="text" name="id"><br> <input
			type="submit" value="search">
			
			<pre>
			  Company : ${dto.company}
			  Name : ${dto.name}
			  Type : ${dto.type}
			  Cost : ${dto.cost}
			  Country :  ${dto.country}
			</pre>
	</form>

</body>
</html>