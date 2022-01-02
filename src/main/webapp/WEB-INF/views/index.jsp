<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pl">
<head>
    <title>Home</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {
            box-sizing: border-box;
        }
        body {
            font-family: Arial, Helvetica, sans-serif;
            margin: 0;
        }
        .header {
            padding: 80px;
            text-align: center;
            background: cornflowerblue;
            color: white;
        }
        .header h1 {
            font-size: 40px;
        }
        .navbar {
            overflow: hidden;
            background-color: #333;
            position: sticky;
            position: -webkit-sticky;
            top: 0;
        }
        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }
        .navbar a.right {
            float: right;
        }
        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }
        .navbar a.active {
            background-color: #666;
            color: white;
        }
        .row {
            display: -ms-flexbox;
            display: flex;
            -ms-flex-wrap: wrap;
            flex-wrap: wrap;
        }
        .side {
            -ms-flex: 30%;
            flex: 30%;
            background-color: #f1f1f1;
            padding: 20px;
        }
        .main {
            -ms-flex: 70%;
            flex: 70%;
            background-color: white;
            padding: 20px;
        }
        .fakeimg {
            background-color: #aaa;
            width: 100%;
            padding: 20px;
        }
        .footer {
            padding: 20px;
            text-align: center;
            background: #ddd;
        }
        @media screen and (max-width: 700px) {
            .row {
                flex-direction: column;
            }
        }
        @media screen and (max-width: 400px) {
            .navbar a {
                float: none;
                width: 100%;
            }
        }
    </style>
</head>
<body>

<div class="header">
    <h1>Study with us !</h1>
    <p>Best <b>university</b> in the country.</p>
</div>

<div class="navbar">
    <a href="#" class="active">Home</a>
    <a href="<c:url value="/register"/>" class="right">Registration</a>
</div>

<div class="row">
    <div class="side">
        <h2>About University</h2>
        <h5>Photo of main building:</h5>
        <div class="fakeimg" style="height:200px;">Place for image</div>
        <p>Some text about university culpa qui officia deserunt mollit anim..</p>
        <h3>More informations</h3>
        <p>Lorem ipsum dolor sit ame.</p>
        <div class="fakeimg" style="height:60px;">Place for image</div><br>
        <div class="fakeimg" style="height:60px;">Place for image</div><br>
        <div class="fakeimg" style="height:60px;">Place for image</div>
    </div>
    <div class="main">
        <h2>New website improves registration by students!</h2>
        <h5>Dec 29, 2021</h5>
        <div class="fakeimg" style="height:200px;">Place for image</div>
        <p>Lorem ipsum</p>
        <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
        <br>
        <h2>Example</h2>
        <h5>Sep 22, 2021</h5>
        <div class="fakeimg" style="height:200px;">Image</div>
        <p>Lorem ipsum</p>
        <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
    </div>
</div>

<div class="footer">
    <h2>Footer..</h2>
</div>

</body>
</html>