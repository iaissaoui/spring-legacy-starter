<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  Setter Injection Test 0. </P>
<P>  myObject0 ${myObject0}. </P>
<P>  myObject1 ${myObject1}. </P>

<P>  Constructor Injection Test 0. </P>
<P>  myObject00 ${myObject00}. </P>
<P>  myObject11 ${myObject11}. </P>


</body>
</html>
