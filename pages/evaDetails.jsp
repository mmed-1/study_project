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
		</style>
	</head>
	<body>
		<header></header>
		
		<h2>
			Evaluation details of 
			<c:out value="${session.name }"/>
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
				<c:forEach var="eva" items="">
					<tr>
						<c:out value="${eva.m_Article.nom }" />
					</tr>
					<tr>
						<c:out value="${eva.m_PC.nom + ' ' + eva.m_PC.prenom }" />
					</tr>
					<tr>
						<c:out value="${eva.remarques }" />
					</tr>
					<tr>
						<c:out value="${eva.recommandations }"/>
					</tr>
					<tr>
						<c:out value="${eva.decision }"/>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			<form action="" method="post">
				<input type="hidden" name="articleId" value="">
				<input type="hidden" name="articleName" value="">
				<input type="submit" name="go" value="Make a decision">
			</form>
		<footer></footer>
	</body>
</html>