<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 12/20/17
  Time: 11:22 PM
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
    <form:form method="POST" action="/newMovie" modelAttribute="movie">
        <div class="form-group">
            <form:label path="name">Movie Name</form:label>
            <form:input path="name" type="text" class="form-control" id="name" placeholder="Enter movie name"/>
        </div>
        <div class="form-group">
            <form:label path="director">Director</form:label>
            <form:input path="director" type="text" class="form-control" id="director" placeholder="Director name"/>
        </div>
        <div class="form-group">
            <form:label for="description" path="description">Movie description</form:label>
            <form:textarea path="description" class="form-control" id="description" rows="3"></form:textarea>
        </div>
        <div class="form-group">
            <form:label path="image" for="image">Movie Cover</form:label>
            <form:input path="image" type="file" class="form-control-file" id="image"/>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form:form>
</div>







    <%--<form >--%>
        <%--<div class="form-group">--%>
            <%--<label for="movieName">Movie Name</label>--%>
            <%--<input type="text" class="form-control" id="movieName" placeholder="Enter movie name">--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label for="movieDirector">Director</label>--%>
            <%--<input type="text" class="form-control" id="movieDirector" placeholder="Director name">--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label for="movieDescription">Movie description</label>--%>
            <%--<textarea class="form-control" id="movieDescription" rows="3"></textarea>--%>
        <%--</div>--%>
        <%--<div class="form-group">--%>
            <%--<label for="movieImage">Movie Cover</label>--%>
            <%--<input type="file" class="form-control-file" id="movieImage">--%>
        <%--</div>--%>
        <%--<button type="submit" class="btn btn-primary">Submit</button>--%>
    <%--</form>--%>

</body>
</html>
