
<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 08/05/15
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title>Patient Details</title>
</head>
<body>

<c:if test="${not empty error}">
    <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
    <div class="msg">${msg}</div>
</c:if>
<c:if test="${not empty message}">
    <div class="msg">${message}</div>
</c:if>

<form action="<c:url value='/create' />" method='POST'>

    <input type="text" placeholder="first name" name="patient_fname" required><br>
    <input type="text" placeholder="last name" name="patient_lname" required><br>
    <input type="email" placeholder="Email Address" name="patient_email" required><br>
    <input type="date" placeholder="Date Birth" name="date_birth" required><br>

    <button class = "btn btn-primary"> Submit</button>

</form>


</body>
</html>
