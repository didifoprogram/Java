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
    <title>Title</title>
</head>
<body>
<h1>Listing organizations</h1>
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
