<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="d" uri="jakarta.tags.core" %>
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
		
		<h2>Articles Overview and Evaluation</h2>
		
		<table>
			<thead>
				<tr>
					<th>Article id</th> <!-- I think it's ok bc rah id dyal article hna machi sensible -->
					<th>Article name</th>
					<th>Title of papers</th>
					<th>Summary</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<d:forEach var="article" items=""> <!-- ta hna matensach items -->
					<tr>
						<td>
							<d:out value="${article.id }" />
						</td>
						<td>
							<d:out value="${article.nom }" />
						</td>
						<td>
							<d:out value="${article.titrePapiers }" />
						</td>
						<td>
							<d:out value="${article.Resume }" />
						</td>
						<td style="color: red;">
							<form action="" method="post">   <!-- don't forget about the Servlet -->
								<input type="hidden" name="articleId" value="${article.id }" />
								<input type="hidden" name="ArticleName" value="${article.nom }" />
								<input type="submit" name="click" value="see reviews">
							</form>
						</td>
					</tr>
				</d:forEach>
			</tbody>
		</table>
		
		<footer></footer>
	</body>
</html>