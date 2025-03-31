package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import dbManegment.AuthorEmailDao;
import dbManegment.DecisionDao;
import emailTesting.SendEmail;

@WebServlet("/d")
public class DecisionServlest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DecisionServlest() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		DecisionDao decisionDao = new DecisionDao();
		AuthorEmailDao authors = new AuthorEmailDao();
		
		int articleID = Integer.valueOf((String) request.getSession().getAttribute("articleId"));
		int conferenceID = 1; //Integer.valueOf((String) request.getAttribute("confID"));
		
		String decision = request.getParameter("decision");
		boolean validate = decision.equals("accepted");
		
		boolean isInsert = decisionDao.saveTheDecision(articleID, conferenceID, validate);
		session.setAttribute("insert", isInsert);
		
		if(isInsert) {
			for(String email : authors.getEmails(articleID)) 
				SendEmail.sendEmail(email, request.getParameter("articleName"), decision, "name of article", validate);
		}
		
		request.getRequestDispatcher("/pages/makeDecision.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
