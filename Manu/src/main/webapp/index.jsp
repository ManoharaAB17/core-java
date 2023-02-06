<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
	.fm{
	  margin:auto;
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
				<a class="navbar-brand" href="#"><img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="" width="80" height="48"></a>
				
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav">
						<li class="nav-item"><a  href="index.jsp" class="btn btn-info">Home</a></li> &nbsp;&nbsp;					
						
					</ul>
				</div>
			</div>
		</nav>
 
	<form class="fm" action="mail" method="get">
		<label>Email : ${email} </label> <br>
		 <input type="submit" value="Get Email" class="btn btn-info"/>
	</form>
	
	<form action="mobile" method="get">
    <label>Mobile Number : ${mobilem} </label> <br>
  		<input type="submit" value="Get Mobile Number" class="btn btn-info"/>
   </form>
   
   <form class="fm" action="age" method="get">
    <label>Age: ${age} </label> <br>
  		<input type="submit" value="Get Age" class="btn btn-info"/>
	</form>
	
	<form action="adr" method="get">
    <label>Aadhar : ${aadhar} </label> <br>
  		<input type="submit" value="Get Aadhar" class="btn btn-info"/>
	</form>
	
     <form  class="fm" action="dob" method="get">
    <label>DOB  : ${dob} </label> <br>
  		<input type="submit" value="Get DOB" class="btn btn-info"/>
	</form>
	
	 <form action="sallary" method="get">
    <label>Desired Sallary : ${sall} </label> <br>
  		<input type="submit" value="Get Sal info" class="btn btn-info"/>
	</form>
     
     <form class="fm" action="bestfrnds" method="get">
    <label>Best Frinds are   : </label> <br>
  
  		<input type="submit" value="Get Best Friends List" class="btn btn-info"/>
  		  <ul>
  		   <c:forEach items="${best}" var="bfm">
  		   <li>${bfm}</li>  		   
  		   </c:forEach>
  		
  		</ul>
	</form>
	
	<form action="visitedPlace" method="get">
    <label>Most Visited Palce : </label> <br>
  
  		<input type="submit" value="Get Most Visited Place" class="btn btn-info"/>
  		  <ul>
  		   <c:forEach items="${vistedp}" var="vp">
  		   <li>${vp}</li>  		   
  		   </c:forEach>
  		
  		</ul>
	</form>
	
	<form class="fm" action="listOfSkill" method="get">
    <label>List Of Skill Set : </label> <br>
  
  		<input type="submit" value="Get Skill Set" class="btn btn-info"/>
  		  <ul>
  		   <c:forEach items="${skill}" var="sk">
  		   <li>${sk}</li>  		   
  		   </c:forEach>
  		
  		</ul>
	</form>
	
	<form action="edu" method="get">
    <label>Education  : </label> <br>
          <label>Name  : ${eduDto.name} </label> <br>
           <label>Standard  :${eduDto.standard} </label> <br>
          <label>Section   :${eduDto.section} </label> <br>
          <label>Total Subjects  :${ eduDto.totSubjects} </label> <br>
          <label>Subject 1  :${eduDto.sub1 } </label> <br>
          <label>Subject 2  :${eduDto.sub2} </label> <br>
          <label>Subject 3  :${ eduDto.sub3} </label> <br>
          <label>Subject 4  : ${eduDto.sub4 }</label> <br>
          <label>Subject 5  : ${eduDto.sub5 }</label> <br>
          <label>Subject 6  :${ eduDto.sub6} </label> <br>
         
  		<input type="submit" value="Get Education Deatils" class="btn btn-info"/>
  		 
	</form>
	
	<form class="fm" action="mob" method="get">
    <label>Mobile Dto  : </label> <br>
          <label>Name  : ${mobi.name} </label> <br>
          <label>Model  :${mobi.model} </label> <br>
          <label>Price :${mobi.price} </label> <br>
          <label>Display Size :${mobi.dispSize} </label> <br>
          <label>Ram : ${mobi.ram}</label> <br>
         
  		<input type="submit" value="Get Mobile Deatils" class="btn btn-info" class="btn btn-info"/>
  		 
	</form>
	
	<form action="bev" method="get">
    <label>Bevrage Dto  : </label> <br>
          <label>Name  : ${bev.name} </label> <br>
          <label>ID  : ${bev.id} </label> <br>
          <label>Quantity  : ${bev.quantity} </label> <br>
          <label>Price  : ${bev.price} </label> <br>
          <label>Barcode  : ${bev.barcodeNo} </label> <br>
          <label>Colour  : ${bev.colour} </label> <br>
          <label>Flavour  : ${bev.flavour} </label> <br>
          <label>type  : ${bev.type} </label> <br>
          <label>ModifyDate  : ${bev.mfdDate} </label> <br>
          <label>ExpiryDate  : ${bev.expDate} </label> <br>
  		<input type="submit" value="Get Bevrage Deatils" class="btn btn-info"/>
  		 
	</form>
	
	<form class="fm" action="chat" method="get">
    <label>Chat Dto  : </label> <br>
          <label>Name  : ${chat.name} </label> <br>
          <label>ID  : ${chat.id} </label> <br>
          <label>Location  : ${chat.location} </label> <br>
          <label>Price  : ${chat.price} </label> <br>
          <label>Chat 1  : ${chat.chat1} </label> <br>
          <label>Chat 2 : ${chat.chat2} </label> <br>
          <label>Chat 3  : ${chat.chat3} </label> <br>
          <label>Chat 4  : ${chat.chat4} </label> <br>
          <label>Chat 5  : ${chat.chat5} </label> <br>
          <label>Chat 6  : ${chat.chat6} </label> <br>
  		<input type="submit" value="Get Chat Deatils" class="btn btn-info"/>
  		 
	</form>

</body>
</html>