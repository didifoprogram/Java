<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 11/17/17
  Time: 5:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<nav aria-label="breadcrumb" role="navigation">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="${contextPath}/">Home</a></li>
        <li class="breadcrumb-item"><a href="${contextPath}/jstlsql">SQL</a></li>
        <li class="breadcrumb-item"><a href="${contextPath}/service">Service</a></li>
        <li class="breadcrumb-item"><a href="${contextPath}/info">Info</a></li>
    </ol>
</nav>
<h1>Listing organizations with sql</h1>
<sql:query var="rs" dataSource="jdbc/springdb">
    SELECT * FROM organization
</sql:query>
<c:forEach var="row" items="${rs.rows}">
    Name: ${row.company_name} <br/>
    Year: ${row.year_of_incorporation} <br/>
    Postal Code: ${row.postal_code} <br/>
    Emp count: ${row.employee_count} <br/>
    Slogan: ${row.slogan} <br/><br/>
</c:forEach>
</body>
</html>
