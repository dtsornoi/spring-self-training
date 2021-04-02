<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dmitr
  Date: 4/2/2021
  Time: 1:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
        First Name: <form:input path="firstName" />
        <br>
        Last Name: <form:input path="lastName" />
        <br>
        Country:
<%--        <form:select path="country">--%>
<%--            <form:options items="${student.countryOptions}" />--%>
<%--        </form:select>--%>
        <br>
        <form:radiobuttons items="${student.countryOptions}"  path="country"/>
        <input type="submit" value="Submit">

    </form:form>
</body>
</html>
