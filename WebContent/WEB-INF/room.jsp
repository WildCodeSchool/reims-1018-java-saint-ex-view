<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${room.title}</title>
<link rel="stylesheet" href="<%= request.getContextPath() %>/style.css">
</head>
<body>
	<div class="image-container">
		<img class="image-content" alt="" src="<%= request.getContextPath()%>/photos/full/${room.url}">
		<c:forEach items="${room.links}" var="link">
			<a class="image-link" style="${link.coords}" href="<%= request.getContextPath()%>/${link.href}">${link.text}</a>
		</c:forEach>
	</div>

</body>
</html>