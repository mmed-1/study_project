package dbManegment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Models.Evaluation;

public class EvaluationsManagement {
	
	private final String URL = "jdbc:mysql://127.0.0.1:3306/project";
	private final String USER = "root";
	private final String PASSWORD = "ur password";
	private final String PILOTE = "com.mysql.cj.jdbc.Driver";
	
	//Prepared statement
	private final String SELECT_EVALUATIONS = """ 
												 	SELECT a.Nom AS name, u.Nom , u.Prenom, e.Remarques, e.Recommandations, e.Décision, a.ArticleID
												    FROM evaluation e, article a, user u
												    WHERE a.ArticleID = ? AND e.ArticleID = a.ArticleID AND u.UserID = e.PcID 
											  """;
	
	private Connection connect() throws SQLException {
		try {
			Class.forName(PILOTE);
			System.out.println("Connected with db");
		} catch(ClassNotFoundException e) { e.printStackTrace();}
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
	public List<Evaluation> getEvaluationsDetails(int articleID) {
		List<Evaluation> evaluations = new LinkedList<Evaluation>();
		
		try(Connection connection = connect()) {
			
			PreparedStatement pstmt = connection.prepareStatement(SELECT_EVALUATIONS);
			pstmt.setInt(1, articleID);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				Evaluation eva = new Evaluation();
			
				eva.getM_Article().setNom(result.getString("name"));
				eva.getM_PC().setNom(result.getString("u.Nom"));
				eva.getM_PC().setPrenom(result.getString("Prenom"));
				eva.setRemarques(result.getString("Remarques"));
				eva.setRecommandations(result.getString("Recommandations"));
				eva.setDecision(result.getString("Décision"));
				eva.getM_Article().setId(result.getInt("ArticleID"));
				evaluations.add(eva);
			}
			
			connection.close();
		} catch(SQLException e) {e.printStackTrace();}
		return evaluations;
	}
}
