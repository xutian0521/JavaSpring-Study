<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
</head>
<body>
<h2>Hello World!</h2>
<a href="account/findAll">测试查询</a>

    <form action="account/save" >
        姓名：<input type="text" name="name"/> <br/>
        金额：<input type="text" name="money"/> <br/>
        <input type="submit" value="保存"/>
    </form>
</body>
</html>
