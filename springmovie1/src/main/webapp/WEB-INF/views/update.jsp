<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 12/21/17
  Time: 9:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <%@include file="nav.jsp" %>
</head>
<body>
<div class="d-flex justify-content-md-center">
    <form:form method="POST" action="/newMovie" modelAttribute="update">
        <div class="form-group">
            <form:label path="name">Movie Name</form:label>
            <form:input path="name" type="text" class="form-control" id="name" placeholder="${name}"/>
        </div>
        <div class="form-group">
            <form:label path="director">Director</form:label>
            <form:input path="director" type="text" class="form-control" id="director" placeholder="${director}"/>
        </div>
        <div class="form-group">
            <form:label for="description" path="description">Movie description</form:label>
            <form:textarea  path="description" class="form-control" id="description" rows="3"></form:textarea>
        </div>
        <div class="form-group">
            <form:label path="image" for="image">Movie Cover</form:label>
            <form:input path="image" type="file" class="form-control-file" id="image"/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>
</body>
</html>