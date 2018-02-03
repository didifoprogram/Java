<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 12/5/17
  Time: 11:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="nav.jsp"%>
</head>
<body>
<div class="justify-content-md-center text-center container pa">
    <h2>${movieItem.name}</h2>
    <img class="pa" width="240" height="400" src="<c:url value="/resources/images${movieItem.image}"/>"
         alt="movie name"/>
    <h6 class="pa">Description: ${movieItem.description}</h6>
    <h6 class="pa">Director: ${movieItem.director}</h6>
</div>
</body>
</html>
