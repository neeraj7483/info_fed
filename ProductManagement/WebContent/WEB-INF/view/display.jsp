<%@page import="java.util.ArrayList"%>
<%@page import="com.infogain.bean.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="r"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="width: 40%;text-align: center;">
<table style="width: 100%;">
<tr>
<td>Product ID</td>
<td>Product Name</td>
<td>Product Price</td>
</tr>
<r:forEach items="${list}" var="product">
<tr>
<td><r:out value="${product.pId}"/></td>
<td><r:out value="${product.pName}"/></td>
<td><r:out value="${product.price}"/></td>
</tr>
</r:forEach>

</table>
</div>

<h5><a href="addPage.html">Add Another Product</a></h5>
</body>
</html>