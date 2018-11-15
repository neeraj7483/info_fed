<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
		<h2>Add Employee Data</h2>
		<form:form method="POST" action="save.html">
	   		<table>
			    <tr>
			        <td>Employee ID:</td>
			        <td><form:input path="empId"  readonly="true"/></td>
			    </tr>
			    <tr>
			        <td>Employee Name:</td>
			        <td><form:input path="empName" /></td>
			    </tr>
			    <tr>
			        <td>Employee Age:</td>
			        <td><form:input path="empAge"   /></td>
			    </tr>
			    <tr>
			        <td>Employee Salary:</td>
			        <td><form:input path="salary"   /></td>
			    </tr>
			    
			    <tr>
			        <td>Employee Address:</td>
                    <td><form:input path="empAddress"  /></td>
			    </tr>
			    <tr>
			      <td colspan="2"><input type="submit" value="Submit"/></td>
		      </tr>
			</table> 
		</form:form>
	 
	  </body>
</html>