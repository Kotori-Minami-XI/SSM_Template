<%--
  Created by IntelliJ IDEA.
  User: Kotori
  Date: 2020/4/27
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index.jsp</title>
  </head>
  <body>

  <form action="${pageContext.request.contextPath}/addCustomer.action">
    客户名称:<input type="text" name="cust_name"/> <br>
    客户职业:<input type="text" name="cust_profession"/> <br>
    客户电话: <input type="text" name="cust_phone"/> <br>
    客户邮件: <input type="text" name="email"/> <br>
    <input type="submit" value="添加">
  </form>

  </body>
</html>
