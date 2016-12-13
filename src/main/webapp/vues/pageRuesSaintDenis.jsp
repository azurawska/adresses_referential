<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page rues Saint-Denis</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>

<h3>Liste des rues de Saint-Denis</h3>

<table border="1">
		<thead>
			<tr>
				<th>Identifiant de la rue</th>
				<th>Identifiant de la ville</th>
				<th>Nom complet de la rue</th>
				<th>Nom abrégé de la rue</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listStreet}" var="street">
				<tr>
					<td><c:out value="${street.idStreetName}"/></td>
					<td><c:out value="${street.city.idCity}"/></td>
					<td><c:out value="${street.streetNameLabel}"/></td>
					<td><c:out value="${street.streetNameLabelLight}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<p><a href="index.jsp">Retour</a></p>

</body>
</html>