<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@taglib uri="http://www.springframework.org/tags" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="add.html">
<b>Product ID : <form:input path="pId"/></b><br>
<b>Product Name : <form:input path="pName"/></b><br>
<b>Product Price : <form:input path="price"/></b><br>
<input type="submit" value="Add Product">
</form:form>
</body>
</html>