<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${ information.title }

<% Java.Information info = (Java.Information)request.getAttribute("information"); %>
<%= info.getTitle() %>
</body>
</html>