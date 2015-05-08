<%--
  Created by IntelliJ IDEA.
  User: tony
  Date: 07/05/15
  Time: 16:33
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

<c:if test="${not empty error}">
    <div class="error">${error}</div>
</c:if>
<c:if test="${not empty msg}">
    <div class="msg">${msg}</div>
</c:if>
<c:if test="${not empty message}">
    <div class="msg">${message}</div>
</c:if>

<form action="<c:url value='/add' />" method='POST'>
    <select name = "patient_id" required>
        <c:forEach var="list"  items="${patientList}">
            <option value="${list.id}">${list.fname}</option>
        </c:forEach>
    </select>
    <br>
    <%--<input type="text" placeholder="Patient ID" name="patient_id" required><br>--%>
    <input type="text" placeholder="Drug Name" name="drug_name" required><br>

    <button> Add</button>

</form>

</body>
</html>
