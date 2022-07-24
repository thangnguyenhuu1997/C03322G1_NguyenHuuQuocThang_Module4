<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/24/2022
  Time: 8:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="/calculator" method="post">
  <h3>Calculator</h3>
  <div>
    <span><input type="number" name="num1" value="${num1}" placeholder="Input number"></span>
    <span><input type="number" name="num2" value="${num2}" placeholder="Input number"></span>
  </div>
  <div>
    <span><input type="submit" name="expression" value="Addition"></span>
    <span><input type="submit" name="expression" value="Subtraction"></span>
    <span><input type="submit" name="expression" value="Multiplication"></span>
    <span><input type="submit" name="expression" value="Division"></span>
  </div>
  <div>
    <p>Result : ${result}</p>
  </div>
</form>
</body>
</html>
