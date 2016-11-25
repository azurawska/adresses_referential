<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page villes</title>
</head>
<body>
<h3>Liste des villes</h3>

<table border="1">
		<thead>
			<tr>
				<th>Identifiant</th>
				<th>Identifiant de région</th>
				<th>Refcode</th>
				<th>Nom</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listCity}" var="city">
				<tr>
					<td><c:out value="${city.idCity}"/></td>
					<td><c:out value="${city.area.idArea}"/></td>
					<td><c:out value="${city.refcode}"/></td>
					<td><c:out value="${city.cityName}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<p><a href="index">Retour</a></p>

</body>
</html>