<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<h3>Welcome to the Inventory Management System</h3>

<table>
<thead>


</thead>

</table>

<form action="saveInventory" method="post">

<table border = "1">

<tr>
<th> Id </th>
<th> Product's Name </th>
<th> price </th>
<th> Aisle </th>
<th> bin </th>
<th> Date of Issue </th>
<th> Status </th>
</tr>

<tr>
<td><input type="text" name="id"/></td>
<td><input type="text" name="product"/></td>
<td><input type="text" name="price"/></td>
<td><input type="text" name="aisle"/></td>
<td><input type="text" name="bin"/></td>
<td><input type="text" name="date"/></td>
<td><input type="text" name="status"/></td>

</tr>
</table>


<input type="submit" value="save"></input>

</form>


<table>
<tr>
<th>
 <form action="displayInventory">
    <input type="submit" value="Display Products" />
</form> 
</th>

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











${message}




</body>
</html>