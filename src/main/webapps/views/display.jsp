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
    <title>Drugs</title>
   </head>
<body>
<div class = "navbar navbar-default">Drugs List</div>
<table>
    <tr>
        <thead>Drug ID</thead>
        <thead>Drug Name</thead>
        <thead>Patient ID</thead>
    </tr>
    <c:forEach var="list"  items="${detailsList}">
        <tr>
            <td>${list.id}</td>
            <td>${list.dname}</td>
            <td>${list.patientid}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
