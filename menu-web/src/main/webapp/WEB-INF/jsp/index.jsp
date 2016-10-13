<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/13
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title></title>

  </head>
  <body>
    <form action="" method="post">
      <ul>
        <c:forEach var="v" items="${list}">
        <li>${v.moduleName}</li>
        </c:forEach>
      </ul>

    </form>

  </body>

</html>
