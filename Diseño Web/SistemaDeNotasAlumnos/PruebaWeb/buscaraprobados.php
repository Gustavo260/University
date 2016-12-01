<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Documento sin título</title>
</head>
<?php 
	$cnn=mysql_connect("localhost","root","");
	mysql_select_db("web700",$cnn);
	$r=mysql_query("select alumno.nombre, alumno.apellido, asignatura.nombre, cursar.promedio FROM alumno JOIN cursar ON alumno.rut=cursar.rut JOIN asignatura ON asignatura.codigo=cursar.codigo WHERE cursar.promedio>=4.0");
?>
<body>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
    <div align="center"><strong>Aprobados</strong> </div>
	<table width="200" border="1" align="center">
    <tr>
    	<td>Nombre</td><td>Apellido</td><td>Asignatura</td><td>Promedio</td>
    </tr>
    <?php while($v=mysql_fetch_array($r)){
    ?>
	  <tr>
      <td><?php echo "".$v[0]."</td> <td>".$v[1]."</td> <td>".$v[2]."</td> <td>".$v[3]."</td>" ?>
      </tr>
     <?php } ?> 
</table>
	<p></p>
</body>
</html>