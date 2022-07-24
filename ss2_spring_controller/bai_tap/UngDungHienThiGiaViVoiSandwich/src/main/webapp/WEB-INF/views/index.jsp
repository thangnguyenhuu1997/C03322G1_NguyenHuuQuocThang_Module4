<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 7/24/2022
  Time: 8:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="/save" method="post">
  <div><h3>Sandwich Condiments</h3></div>
  <div>
    <span><input type="checkbox" name="condiment" value="Lettuce">Lettuce</span>
    <span><input type="checkbox" name="condiment" value="Tomato">Tomato</span>
    <span><input type="checkbox" name="condiment" value="Mustard">Mustard</span>
    <span><input type="checkbox" name="condiment" value="Sprouts">Sprouts</span>
  </div>
  <div><input type="submit" value="Save"></div>
</form>
<div>
  <span><b>Your choice is:</b></span>
  <span>${result}</span>
</div>
</body>
</html>
