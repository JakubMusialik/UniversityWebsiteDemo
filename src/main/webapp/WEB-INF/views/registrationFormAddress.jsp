<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: Calibri, Helvetica, sans-serif;
            background-color: black;
        }

        .container {
            padding: 150px;
            background-color: white;
        }

        input[type=text] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus {
            background-color: lightgrey;
            outline: none;
        }

        div {
            padding: 10px 0;
        }

        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        .registerbtn {
            background-color: #4CAF50;
            color: white;
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }

        .registerbtn:hover {
            opacity: 1;
        }
    </style>
</head>
<body>
<form:form modelAttribute="address" method="post">
    <div class="container">
        <center><h1>Current Address :</h1></center>
        <label><b>Street:</b></label>
        <form:input type="text" path="street" placeholder="Street"/>
        <label><b>House number:</b></label>
        <form:input type="text" path="houseNumber" placeholder="House number"/>
        <label><b>City:</b></label>
        <form:input type="text" path="city" placeholder="City"/>
        <label><b>State:</b></label>
        <form:input type="text" path="countryState" placeholder="State"/>
        <label><b>Post code:</b></label>
        <form:input type="text" path="postCode" placeholder="Post code"/>
        <label><b>Country:</b></label>
        <form:input type="text" path="country" placeholder="Country"/>
        <form:hidden path="student" />
        <button type="submit" class="registerbtn">Register</button>
    </div>
</form:form>
</body>
</html>