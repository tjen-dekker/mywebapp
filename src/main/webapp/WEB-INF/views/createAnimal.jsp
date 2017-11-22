<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
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
<h1>create animal</h1>

<sf:form method="post" commandName="animal">
    <div>
        <label>
            Name: <sf:input path="name"/>
        </label>
        <sf:errors path="name" cssStyle="color:red"/>
        <label>
            type: <sf:input path="type"/>
        </label>
        <sf:errors path="type" cssStyle="color:red"/>
        <label>
            age: <sf:input path="age"/>
        </label>
        <sf:errors path="age" cssStyle="color:red"/>

    </div>
    <input type="submit" value="Create Animal"/>
</sf:form>

</body>
</html>
