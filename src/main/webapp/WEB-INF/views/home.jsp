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

<h2>Bean Factory</h2>
<P>  Setter Injection Test 0. </P>
<P>  ObjectA0 ${ObjectA0}. </P>
<P>  ObjectA1 ${ObjectA1}. </P>

<P>  Constructor Injection Test 0. </P>
<P>  ObjectB0 ${ObjectB0}. </P>
<P>  ObjectB1 ${ObjectB1}. </P>

<h2>Application Context</h2>

<P>  Setter Injection Test 0. </P>
<P>  ObjectA0AC ${ObjectA0AC}. </P>
<P>  ObjectA1AC ${ObjectA1AC}. </P>

<P>  Constructor Injection Test 0. </P>
<P>    ObjectB0AC  ${ObjectB0AC}. </P>
<P>    ObjectB1AC  ${ObjectB1AC}. </P>


<p>Dependency Injection</p>
<p>ObjectCAC ${ObjectCAC}</p> 
 

</body>
</html>
