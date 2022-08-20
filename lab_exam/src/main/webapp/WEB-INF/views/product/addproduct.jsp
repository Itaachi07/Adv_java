<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product Page</title>
</head>
<body>
	<h1>Add Product Page</h1>
	<form:form method="post" modelAttribute="product">

		<table style="background-color: lightgrey; margin: auto">
			<tr>
				<td>Enter name</td>
				<td><form:input type="text" path="p_name" /></td>
			</tr>
			<tr>
				<td>Enter Desc</td>
				<td><form:input type="text" path="p_desc" /></td>
			</tr>
			<tr>
				<td>Enter Qty</td>
				<td><form:input type="text" path="p_Qnty" /></td>
			</tr>
			<tr>
				<td>Enter Price</td>
				<td><form:input type="text" path="p_price" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>