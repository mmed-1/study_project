<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>manifestation scinetifiques</title>
		<link href="" type="image/x-icon" rel="icon" />
		<meta name="viewport" content="width=device-width, initiale-scale=1.0">
		<meta charset="UTF-8">
		<meta name="description" content="site de manifestation scinetifiques">
		<meta name="keywords" content="FST, manifestation, science, scinetifiques">
		<link rel="stylesheet" href="">   <!-- if we have a css file -->
		<link rel="preconnect" href="https://fonts.googleapis.com">
		<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
		<link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" 
			  rel="stylesheet">
		<style type="text/css">
			body {
				font-family: "Poppins", sans-serif;
			    font-style: normal;
			}
			table, td, th {
				border: solid 2px black;
				border-collapse: collapse;
			}
		</style>
	</head>
	<body>
		<header></header>
		
		<h2>
			Evaluation details of 
			<c:out value="${sessionScope.nom }"/>
		</h2>
		<table>
			<thead>
				<tr>
					<th>Article name</th> <!-- I think it's ok bc rah id dyal article hna machi sensible -->
					<th>reviewer name</th>
					<th>Remarks</th>
					<th>Recommandations</th>
					<th>Decision</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${eva }">
					<c:set var="id" value="${e.m_Article.id }"/>
					<c:set var="name" value="${e.m_Article.nom }"/>
					<tr>
						<td>
							<c:out value="${e.m_Article.nom }" />
						</td>
						<td>
							<c:out value="${e.m_PC.nom } ${e.m_PC.prenom }" />
						</td>
						<td>
							<c:out value="${e.remarques }" />
						</td>
						<td>
							<c:out value="${e.recommandations }"/>
						</td>
						<td>
							<c:out value="${e.decision }"/>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			<form action="/_manifestations_scientifiques/R?action=md" method="post">
				<input type="hidden" name="articleId" value="${id }">
				<input type="hidden" name="articleName" value="${name }">
				<input type="submit" name="go" value="Make a decision">
			</form>
		<footer></footer>
	</body>
</html>