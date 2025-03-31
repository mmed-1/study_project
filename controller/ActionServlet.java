package controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import Models.Article;
import Models.Evaluation;
import dbManegment.ArticlesManagement;
import dbManegment.EvaluationsManagement;

@WebServlet("/R")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String var = request.getParameter("action");
		
		switch(var) {
			case "da" : //da : display_articles
				LinkedList<Article> articles = (LinkedList<Article>) sendArticles(2); //request.getSession().getAttribute("confId") arg
				request.setAttribute("articles", articles);
				request.getRequestDispatcher("/pages/consultationOfEva.jsp").forward(request, response);
				break;
			case "det": //det : details
				HttpSession session = request.getSession();
				session.setAttribute("nom", request.getParameter("ArticleName"));
				LinkedList<Evaluation> eva = (LinkedList<Evaluation>) sendEvaluations(Integer.valueOf(request.getParameter("articleId")));
				request.setAttribute("eva", eva);
				request.getRequestDispatcher("/pages/evaDetails.jsp").forward(request, response);
				break;
			case "md": //md : make decision
				LinkedList<Article> articless = (LinkedList<Article>) sendArticles(2);
				request.setAttribute("articles", articless);
				request.getRequestDispatcher("/pages/articlesEva.jsp").forward(request, response);
				break;
			case "fn": //final
				HttpSession sess = request.getSession();
				sess.setAttribute("articleId", request.getParameter("articleId"));
				sess.setAttribute("articleName", request.getParameter("articleName"));
				response.sendRedirect("/_manifestations_scientifiques/pages/makeDecision.jsp");
				break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public List<Article> sendArticles(int confID) {
		ArticlesManagement mgt = new ArticlesManagement();
		return  mgt.getArticles(confID);
	}
	
	public List<Evaluation> sendEvaluations(int articleID) {
		EvaluationsManagement eva = new EvaluationsManagement();
		return eva.getEvaluationsDetails(articleID);
	}
}
