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
	<div class="image-container">
		<img class="image-content" alt="" src="<%= request.getContextPath()%>/photos/full/20181219_100739.jpg">
		<a class="image-link" style="top:35%;left:5%" href="<%= request.getContextPath()%>/laboMachine">Labo</a>
		<a class="image-link" style="top:20%;left:50%" href="<%= request.getContextPath()%>/spectacle">Spectacle</a>
		<a class="image-link" style="top:75%;left:40%" href="http://localhost:8080/Hackathon/index.html">Retour</a>
		<a class="image-link" style="top:65%;left:75%" href="<%= request.getContextPath()%>/bar">Bar</a>
	</div>

</body>
</html>