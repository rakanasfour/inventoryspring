<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Product</title>
</head>
<body>
<h3>Welcome to Display Product Page</h3>

<h2>Products</h2>
<table border ="1">
<tr>
<th>Id</th>
<th>Product</th>
<th>Price</th>
<th>Aisle</th>
<th>Bin</th>
<th>Date Of Issue</th>
<th>Status</th>
<th>Delete</th>
<th>Edit</th>
</tr>

<c:forEach items="${inventorys}" var="inventory">
<tr>
<td>${inventory.id}</td>
<td>${inventory.product}</td>
<td>${inventory.price}</td>
<td>${inventory.aisle}</td>
<td>${inventory.bin}</td>
<td>${inventory.date}</td>
<td>${inventory.status}</td>
<td><a href="deleteInventory?id=${inventory.id}">Delete</a></td>
<td><a href="showUpdate?id=${inventory.id}">Edit</a></td>
</tr>
</c:forEach>
</table>




<table>
<tr>
<th>

<form action="home">
    <input type="submit" value="Home Page" />
</form>

<th>
<form action="bannedProduct">
    <input type="submit" value="Display Banned Product Only" />
</form>
</th>

<th>
<form action="minPrice" method="post">
    <input type="text" name="price" placeholder="Price Lower Than : " />
</form>

</th>
<th>

<form action="searchProduct" method="post">
<input type="text" name="product" placeholder="Search by Product"/>
</form>


</th>

</tr>
</table>



<br>
 <form action="logout" >
    <input type="submit" value="Log Out" />
</form>

</body>
</html>