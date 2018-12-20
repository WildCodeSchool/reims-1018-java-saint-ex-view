<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
</head>
<body>
${ information.title }

<% Java.Information info = (Java.Information)request.getAttribute("information"); %>
<%= info.getTitle() %>

	<div class="image-container">
		<img class="image-content" alt="" src="<%= request.getContextPath()%>/photos/full/20181219_095742.jpg">
		<a class="image-link" style="top:15%;left:20%" href="<%= request.getContextPath()%>/accueil">Accueil</a>
		<a class="image-link" style="top:40%;left:80%" href="?id=42">Retour</a>
	</div>

</body>
</html>