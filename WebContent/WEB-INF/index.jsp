<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/style.css"/>

<title>Saint Ex View</title>
</head>
<body>




<h1>Hello World</h1>
<nav>
  <div class="nav nav-pills justify-content-center" id="nav-tab" role="tablist">
    <a class="nav-item nav-link active" id="nav-stex-tab" data-toggle="tab" href="#nav-stex" role="tab" aria-controls="nav-stex" aria-selected="true">Se rendre à Saint Ex</a>
    <a class="nav-item nav-link" id="nav-rdc-tab" data-toggle="tab" href="#nav-rdc" role="tab" aria-controls="nav-rdc" aria-selected="false">RDC</a>
    <a class="nav-item nav-link" id="nav-ss-tab" data-toggle="tab" href="#nav-ss" role="tab" aria-controls="nav-ss" aria-selected="false">SS</a>
  </div>
</nav>

<div class="tab-pane fade show active" id="nav-stex" role="tabpanel" aria-labelledby="nav-stex-tab">
		<img src="<%= request.getContextPath() %>/photos/full/itinéraire.png" class="img-fluid" alt="Responsive image">
</div>

<div class="tab-pane fade" id="nav-rdc" role="tabpanel" aria-labelledby="nav-rdc-tab">
		<img src="<%= request.getContextPath() %>/photos/full/20181219_100824.jpg" class="img-fluid" alt="Responsive image">
</div>

<div class="tab-pane fade" id="nav-ss" role="tabpanel" aria-labelledby="nav-ss-tab">
  	<div id="zonep">
		<img src="<%= request.getContextPath() %>/photos/full/20181219_102336.jpg" class="img-fluid" alt="Responsive image">
   	</div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>