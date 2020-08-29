<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Producto</title>
</head>
<body>

	<h1>Crear Producto</h1>
	<form action="productos" method="post">
		<input type="hidden" name="opcion" value="guardar"></input>
		<table>
			<tr>
				<td>Nombre:</td>
				<td> <input type="text" name="nombre" size="40"></input> </td>
			</tr>
			
			<tr>
				<td>Cantidad:</td>
				<td> <input type="text" name="cantidad" size="40"></input> </td>
			</tr>
			
			<tr>
				<td>Precio:</td>
				<td> <input type="text" name="precio" size="40"></input> </td>
			</tr>
			
		</table>
			<input type="submit" value="Crear" name="btncrear" ></input>
	</form>
</body>
</html>