
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert customer</title>

</head>
<body>





	<h1>Add New Customer</h1>
    <form id="addCustomerForm">
        <label for="first_name">First Name:</label>
        <input type="text" id="first_name" required><br>

        <label for="last_name">Last Name:</label>
        <input type="text" id="last_name" required><br>

        <label for="street">Street:</label>
        <input type="text" id="street"><br>

        <label for="address">Address:</label>
        <input type="text" id="address"><br>

        <label for="city">City:</label>
        <input type="text" id="city"><br>

        <label for="state">State:</label>
        <input type="text" id="state"><br>

        <label for="email">Email:</label>
        <input type="email" id="email"><br>

        <label for="phone">Phone:</label>
        <input type="tel" id="phone"><br>

        <input type="submit" value="Add Customer">
    </form>
    <br>
    <button onclick="goBack()">Go Back</button>

    <script src="add_customer.js"></script>
</body>
</html>




