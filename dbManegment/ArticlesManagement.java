package dbManegment;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import Models.Article;

public class ArticlesManagement {
	
	//PREPARED STATEMENTS
	private final String SELECT_ARTICLES = """ 
												SELECT a.ArticleID, a.Nom, a.TitrePapiers, a.Resume
												FROM article a, gerer g, evaluation e
												WHERE a.ArticleID = e.ArticleID AND g.MemberID = e.Sc_respo_ID 
													AND  g.MemberID = ? AND g.ConferenceID = ?
										   """;
	
	//INFOS
	private final String URL="jdbc:mysql://localhost:3306/project";
	private final String USER = "root";
	private final String PASSWORD = "YOUR PASSWORD";   
	
	
	public ArticlesManagement() {
		super();	
	}
	
	private Connection connect() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Connected with DB");
		} catch(ClassNotFoundException e) { e.printStackTrace();}
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	
	public List<Article> getArticles(int memberID, int confID) {
		List<Article> articles = new LinkedList<Article>();
		try(Connection connection = this.connect()) {
			PreparedStatement pstmt = connection.prepareStatement(SELECT_ARTICLES);
			pstmt.setInt(1, memberID);
			pstmt.setInt(2, confID);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				Article article = new Article();
				article.setId(result.getInt("ArticleID"));
				article.setNom(result.getString("Nom"));
				article.setTitrePapiers(result.getString("TitrePapiers"));
				article.setResume(result.getString("Resume"));
				articles.add(article);
			}
			
			connection.close();
		} catch(SQLException e) {e.printStackTrace();}
		return articles;
	}
}
