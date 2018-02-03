<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 12/5/17
  Time: 10:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Movies DB</title>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet" type="text/css"/>
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet" type="text/css"/>
    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.2.1.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm navbar-light bg-light d-flex justify-content-around">
    <ul class="nav navbar-nav">
        <li class="nav-item">
            <a class="nav-link" href="/">Home</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/movies">Movies</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/newMovie">New Movie</a>
        </li>
    </ul>
    <form class="navbar-form">
        <input type="text" style="width: 200px;">
        <button type="submit" class="btn btn-outline-primary">Search</button>
    </form>
</nav>
</body>
</html>
