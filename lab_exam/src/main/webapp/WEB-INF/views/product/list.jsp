<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>
<h1>Product List page for </h1>
<table style="background-color: lightgrey; margin: auto">
		<tr>
			<th>****</th>
			<th>****</th>
			<th>*****</th>
			<th>****</th>
			<th>***</th>
		</tr>
		<c:forEach var="product" items="${requestScope.product_list}">
			<tr>
				<td>${product}</td>
				<td><a
					href="<spring:url value='/product/delete?id=${product.id}'/>">Delete</a>
				</td>

			</tr>
		</c:forEach>
	</table>
	<h5>
		<a href="<spring:url value='/product/add'/>">Add Product</a>
	</h5>
	<h5>

</body>
</html>