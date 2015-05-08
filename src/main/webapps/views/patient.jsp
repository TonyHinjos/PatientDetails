<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 07/05/15
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <title></title>
</head>
<body>
<c:if test="${not empty error}">
    <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
    <div class="msg">${msg}</div>
</c:if>

<form action="<c:url value='/create' />" method='POST'>
    <input type="text" placeholder="First Name:" name="patient_fname" >
    <input type="text" placeholder="Last Name:" name="patient_lname" >
    <input type="date" placeholder="Date of Birth:" name="date_birth" >
    <input type="email" placeholder="Email Address:" name="patient_email" >


    <button> Create</button>

</form>

</body>
</html>
