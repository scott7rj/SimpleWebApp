<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Hello Cheque</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h1>Cheque</h1>
<div id="wrapper">
	<div id="filter">
		<form>
			<input type="text" id="txtConta" value="900000000" /><br />
			<button id="btnPesquisar" value="pesquisar" onclick="pesquisar()">pesquisar</button>
		</form>
	</div>
	<div id="content">
		<h2>content</h2>
	</div>
</div>

<script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="js/script.js" type="text/javascript"></script>
<script>
$( document ).ready(function() {
	console.log('jquery ready...');
	
});
</script>
</body>
</html>