<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file = "menu.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All</title>
</head>
<body>
<h2>List | All</h2>
<table border = 1>
  <tr>
  <th>Id</th>
  <th>First Name</th>
  <th>Last Name</th>
  <th>email</th>
  <th>mobile</th>
  <th>Delete</th>
  <th>update</th>
  </tr>
  <c:forEach items = "${leads}" var = "lead">
  <tr>
  <td>${lead.id}</td>
  <th>${lead.firstName}</th>
  <th>${lead.lastName}</th>
  <th>${lead.email}</th>
  <th>${lead.mobile}</th>
  <th><a href = "delete?id=${lead.id}">delete</a></th>
  <th><a href = "update?id=${lead.id}">update</a></th>
  </tr>
  </c:forEach>
  
</table>
</body>
</html>