<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 12/5/17
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<script src="${pageContext.request.contextPath}/resources/js/basic.js"></script>
</head>
<body>
<%@include file="nav.jsp" %>
<h4 class="d-flex justify-content-center pa">Movies in DB</h4>
<div class="container d-flex flex-row">
    <c:forEach var="row" items="${movieItem}">
        <ul>
            <li class="d-sm-inline-block">
                <div class="liBorder">
                <a href="<c:url value="/${row.name}"/>">
                    <img class="img-border" height="182" width="123" src="<c:url value="/resources/images${row.image}"/>" alt="${row.name}">
                </a>
                </div>
                <div class="text-sm-center editRemoveBtn"><a href="/update/${row.name}"><button class="btn btn-lg btn-info" type="submit"></button></a>
                    <a href="/remove/${row.name}"><button class="btn btn-lg btn-danger" type="submit"></button></a>
                </div>
            </li>
        </ul>
        <br><br>
    </c:forEach>
</div>
</body>
</html>
