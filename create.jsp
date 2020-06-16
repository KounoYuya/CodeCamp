<%@ page contentType="text/html; charset=utf-8" %>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>new</title>
</head>
<form action="create" method="post">

  <p>
    <b>id</b>
    <input id="id" name="id" size="10" type="text" />
  </p>
  <p>
    <b>name</b>
    <input id="name" name="name" size="10" type="text"/>
  </p>
  <p>
    <b>age</b>
    <input id="age" name="age" size="10" type="text"/>
  </p>
  <p>
    <b>sex</b>
    <input id="sex" name="sex" size="10" type="text"/>
  </p>
  <p>
    <b>address</b>
    <input id="address" name="address" size="10" type="text"/>
  </p>
  <p>
    <b>bid</b>
    <input id="bid" name="bid" size="10" type="text"/>
  </p>
  <p>
    <input id="submit" name="submit" type="submit" value="作成" />
  </p>

</form>
</html>