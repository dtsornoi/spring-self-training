<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dmitr
  Date: 4/2/2021
  Time: 8:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
    <body>
        <form:form action="processForm" modelAttribute="customer">
            First Name: <form:input path="firstName" />
            <br>
            Last Name (*): <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error" />
            <br>
            Free passes: <form:input path="freePasses" />
            <form:errors path="freePasses" cssClass="error" />
            <br>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
