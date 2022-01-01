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
            padding: 178px;
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

        input[type=text] {
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

        .btn {
            background-color: #4CAF50;
            color: black;
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
<form:form modelAttribute="student" method="post">
    <div class="container">
        <center><h1> Student Registration Form</h1></center>
        <hr>
        <form:hidden  path="id" />
        <label><b>Firstname:</b> </label>
        <form:input type="text" path="firstName" placeholder="Firstname"/>
        <label><b>Lastname:</b> </label>
        <form:input type="text" path="lastName" placeholder="Lastname"/>
        <label><b>Phone :</b></label>
        <form:input type="text" path="phoneNumber" placeholder="Phone no."/>
        <label><b>Email</b></label>
        <form:input type="text" path="email" placeholder="email"/>
        <label>Payment confirmation:</label>
        <input type="file" id="myfile" name="myfile">
        <button type="submit" class="btn">Next step</button>
    </div>
</form:form>
</body>
</html>