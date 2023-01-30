<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="fav" method="post">
<pre>
    First Name : <input type="text" name="fname"/>
    Last Name :  <input type="text" name="lname"/>
    Email :  <input type="email" name="gmail"/>
    Gender : <input type="radio" name="gender" value="Male"/> Male  <input type="radio" name="gender" value="FeMale"/> FeMale <input type="radio" name="gender" value="Others"/> Others
    Reason : <input type="textarea" name="reason" />
    Address : <input type="textarea" name="addr"/>
    
    <input type="submit" value="Send">
    

</pre>


</form>

</body>
</html>