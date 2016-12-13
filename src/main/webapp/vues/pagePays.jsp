<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page pays</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>

	<h3>Liste des pays</h3>
	
	<table border="1">
		<thead>
			<tr>
				<th>Identifiant</th>
				<th>Code ISO</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listCountry}" var="country">
				<tr>
					<td><c:out value="${country.idCountry}"/></td>
					<td><c:out value="${country.codeIso}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<p><a href="index.jsp">Retour</a></p>

</body>
</html>