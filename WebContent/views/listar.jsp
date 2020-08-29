<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Productos</title>
</head>
<body>
<h1>Listar Productos</h1>
	
	<table border="1">
		<tr>
			<td>Id</td>
			<td>Nombre</td>
			<td>Cantidad</td>
			<td>Precio</td>
			<td>Fecha Creacion</td>
			<td>Fecha Actualizacion</td>
		</tr>
	<c:forEach var="producto" items="${lista}">
	
		<tr>
			<td><c:out value="${producto.id }"></c:out></td>
			<td><c:out value="${producto.nombre }"></c:out></td>
			<td><c:out value="${producto.cantidad }"></c:out></td>
			<td><c:out value="${producto.precio }"></c:out></td>
			<td><c:out value="${producto.fechaCrear }"></c:out></td>
			<td><c:out value="${producto.fechaActualizar }"></c:out></td>
		</tr>
	
	
	</c:forEach>
	
		
	

	</table>

</body>
</html>