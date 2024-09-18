<%@page import="com.JBK.EmployeeManagmentSystem.Model.*"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>employee table</title>

<style>
table {
	border-collapse: collapse;
	border-spacing: 5px;
	width: 100%;
	border: 5px solid #ddd;
}

th, td {
	text-align: left;
	padding: 16px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>


</head>
<body>

   
   <form action="addcustomerForm"  method="post">
		h1>Customer List</h1>
    <table id="customerTable">
        <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Street</th>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
                <th>Email</th>
                <th>Phone</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody></tbody>
    </table>
    <br>
    <button onclick="addNewCustomer()">Add New Customer</button>
    <button onclick="logout()">Logout</button>

    <script src="customer_list.js"></script>
</body>
</html>
