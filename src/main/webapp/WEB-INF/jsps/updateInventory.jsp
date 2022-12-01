<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update product</title>
</head>
<body>
<h3>Welcome to The Update Product Page</h3>

<form action="updateInventory" method="post">

<table border="1">
<tr>
<th>Id</th>
<th>Product</th>
<th>Price</th>
<th>Aisle</th>
<th>Bin</th>
<th>Date of Issue</th>
<th>Status</th>
</tr>
<tr>
<td><input type="text" name="id" value="${inventory.id}" readonly/></td>
<td><input type="text" name="product" value="${inventory.product}"/></td>
<td><input type="text" name="price" value="${inventory.price}"/></td>
<td><input type="text" name="aisle" value="${inventory.aisle}"/></td>
<td><input type="text" name="bin" value="${inventory.bin}"/></td>
<td><input type="text" name="date" value="${inventory.date}"/></td>
<td><input type="text" name="status" value="${inventory.status}"/></td>
</table>

<input type="submit" value="save"/>

</form>

<br>
 <form action="logout" >
    <input type="submit" value="Log Out" />
</form>
</body>
</html>