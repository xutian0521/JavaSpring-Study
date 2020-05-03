<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/04/29
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8" />
</head>
<body>
 <h3>查询所有账户信息</h3>


    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
</body>
</html>
