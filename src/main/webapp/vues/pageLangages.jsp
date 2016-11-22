<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page langages</title>
</head>
<body>

<h3>Liste des langues</h3>

<table border="1">
		<thead>
			<tr>
				<th>Identifiant</th>
				<th>Code</th>
				<th>Nom</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listLanguage}" var="language">
				<tr>
					<td><c:out value="${language.idLangage}"/></td>
					<td><c:out value="${language.langageCode}"/></td>
					<td><c:out value="${language.langageNom}"/></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

<p><a href="index">Retour</a></p>
</body>
</html>