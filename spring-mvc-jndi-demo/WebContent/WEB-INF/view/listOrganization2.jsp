<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 11/17/17
  Time: 5:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Listing organizations with service</title>
</head>
<body>
<h1>Listing organizations with a service</h1>
<c:forEach var="row" items="${orgList}">
    Name: ${row.companyName} <br/>
    Year: ${row.yearOfIncorporation} <br/>
    Postal Code: ${row.postalCode} <br/>
    Emp count: ${row.employeeCount} <br/>
    Slogan: ${row.slogan} <br/><br/>
</c:forEach>
</body>
</html>
