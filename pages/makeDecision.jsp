<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head lang="en">
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
		<header>
			<!-- maybe here an include IDK -->
		</header>
		<h1>Make a decision</h1>
		
		<form action="/_manifestations_scientifiques/d" method="post">
		
			<label for="r1">Enter the Article ID:</label>
			<input type="text" name="articleId" required="required" id="r1" value="${sessionScope.articleId }" /> <br>
			
			<label for="r12">Enter the article name:</label>
			<input type="text" name="articleName" required="required" id="r12" value="${sessionScope.articleName }"/> <br>
			
			<label>The decision:</label>
			
			<input type="radio" name="decision" required="required" id="r13" value="refuse"/>
			<label for="r13">Refuse </label>
			
			<input type="radio" name="decision" required="required" id="r14" value="accepted"/>
			<label for="r14">Accepted </label>
			
			<input type="submit" name="ok" value="Validate" />
			<input type="reset" name="reset" value="Reset" />
			
		</form>
		
		<c:if test="${param.ok != null and param.ok == 'Validate' }">
			<c:choose>
				<c:when test="${sessionScope.insert != null and sessionScope.insert == true }">
					<div>
						<p style="color: green;">Your decision is successfully registered</p>
					</div>
				</c:when>
				<c:otherwise>
					<div>
						<p style="color: red;">The Decision exist</p>
					</div>
				</c:otherwise>
			</c:choose>
			<% session.removeAttribute("insert"); // Clear after display %>
		</c:if>
		
		<footer>
			<!-- we must have a footer -->
		</footer>
	</body>
</html>