<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TDKBG57
  Date: 2017-11-22
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8"/>
</head>
<body>
<h1>Hello World</h1>
<p>This is a JSP page: ${5 * 8}</p>
<table border="1">
    <thead>
    <tr>
        <th>Name</th>
        <th>type</th>
        <th>age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${animalList}" var="myAnimal">
        <tr>
            <td>${myAnimal.name}</td>
            <td>${myAnimal.type}</td>
            <td>${myAnimal.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
