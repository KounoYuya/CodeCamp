<%@ page contentType="text/html; charset=utf-8" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>list</head>

<body>
<table>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>age</th>
    <th>sex</th>
    <th>address</th>
    <th>bid</th>
  </tr>
<c:forEach var="member" items="${members}">
  <tr>
    <td>${member.id }</td>
    <td>${member.name}</td>
    <td>${member.age }</td>
    <td>${member.sex }</td>
    <td>${member.address }</td>
    <td>${member.bid }</td>
  </tr>
</c:forEach>

</table>
<br/>
</body>
</html>