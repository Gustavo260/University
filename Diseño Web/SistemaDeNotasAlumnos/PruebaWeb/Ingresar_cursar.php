<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>
<?php 
	$rut=$_GET['txtRut'];
	$codigo=$_GET['txtCodigo'];
	$promedio=$_GET['txtPromedio'];
	$cnn=mysql_connect("localhost","root","");
	mysql_select_db("web700",$cnn);
	$r=mysql_query("insert into cursar values(".$rut.",".$codigo.",".$promedio.")");
?>
<body>
<div align="center">
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>los datos han sido agregados en la tabla cursar </p>
</div>
</body>
</html>