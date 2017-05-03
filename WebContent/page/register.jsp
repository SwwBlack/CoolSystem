<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table align="center">
    <tr><img src="http://localhost:8080/CoolSystem/images/banner.jpg" width="100%"/></tr>
    <tr><h3 align="right"><a href="welcome.jsp">首页</a>|<a href="register.jsp">注册</a>|<a href="shuka.jsp">刷卡就餐</a>|<a href="maney.jsp">查询余额</a>|<a>退出</a></h3></tr>
    <tr height="30%">
    <form  align="center" action="register" method="post"> 
             学号：<input type="text" size="20" name="studyNum"/>
             姓名：<input type="text" size="20" name="name">
           <input type="submit" value="注册" >
    </form> 
    </tr>
    <tr height="300"></tr>
    <tr>
      <h2 align="center">关于我们|联系我们|使用手册</h2>
    </tr>
</table>
</body>
</html>