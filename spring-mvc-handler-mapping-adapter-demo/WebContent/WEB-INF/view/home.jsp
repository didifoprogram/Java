<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 11/18/17
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <title>Home</title>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<nav aria-label="breadcrumb" role="navigation">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="${contextPath}/">Home</a></li>
        <li class="breadcrumb-item"><a href="${contextPath}/jstlsql">SQL</a></li>
        <li class="breadcrumb-item"><a href="${contextPath}/service">Service</a></li>
        <li class="breadcrumb-item"><a href="${contextPath}/info">Info</a></li>
    </ol>
</nav>
<ul>
    <li><a href="${contextPath}/jstlsql">Listing organizations using sql</a><br/></li>
    <li><a href="${contextPath}/service">Listing organizations using service</a> </li>
    <li><a class=href="${contextPath}/info">Info abut this project</a></li>
</ul>
</html>
