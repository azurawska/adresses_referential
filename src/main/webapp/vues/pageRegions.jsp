<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des régions</title>
</head>
<body>

<h3>Liste des régions</h3>

<table border="1">
		<thead>
			<tr>
				<th>Identifiant</th>
				<th>Label</th>
				<th>Identifiant de pays</th>
				<th>Identifiant de langage</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listArea}" var="area">
				<tr>
					<td><c:out value="${area.idArea}"/></td>
					<td><c:out value="${area.areaLabel}"/></td>
					<td><c:out value="${area.country.idCountry}"/></td>
					<td><c:out value="${area.language.idLangage}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<p><a href="index">Retour</a></p>

</body>
</html>