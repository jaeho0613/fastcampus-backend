<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="kr">
<head>
  <link rel="shortcut icon" href="data:image/x-icon;," type="image/x-icon">
  <title>list</title>
</head>
<body>
  <table>
    <thead>
    <tr>
      <th>#</th>
      <th>userId</th>
      <th>name</th>
    </tr>
    </thead>
    <tbody>
      <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
          <th scope="row">${status.count}</th>
          <th>${user.userId}</th>
          <th>${user.name}</th>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</body>
</html>