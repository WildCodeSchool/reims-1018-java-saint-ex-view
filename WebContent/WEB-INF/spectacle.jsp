<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spectacle</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
</head>
<body>
	<div class="image-container">
		<img class="image-content" alt="" src="<%= request.getContextPath()%>/photos/full/20181219_101417.jpg">
		<a class="image-link" style="top:15%;left:20%" href="#hello">hello</a>
		<a class="image-link" style="top:40%;left:80%" href="http://localhost:8080/saint-ex_view/">Accueil</a>
	</div>

</body>
</html>