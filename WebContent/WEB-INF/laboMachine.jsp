<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Labomachine</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
</head>
<body>
${ information.title }

	<div class="image-container">
		<img class="image-content" alt="" src="<%= request.getContextPath()%>/photos/mini/IMG_2502.jpg">
		<a class="image-link" style="top:30%;left:10%" href="<%= request.getContextPath()%>/accueil">Retour</a>
		<a class="image-link" style="top:40%;left:80%" href="http://localhost:8080/saint-ex_view/">Accueil</a>
	</div>

</body>
</html>