package dbManegment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuthorEmailDao {
	
	private final String URL = "jdbc:mysql://127.0.0.1:3306/project";
	private final String USER = "root";
	private final String PASSWD = "ur password";
	private final String PILOTE = "com.mysql.cj.jdbc.Driver";
	
	private final String GET_EMAILS = """
											SELECT u.Email
											FROM user u
											WHERE u.UserID IN (
															SELECT u1.UserID
											                FROM user u1, article a, rediger r
											                WHERE a.ArticleID = ? AND r.ArticleID = a.ArticleID AND u.UserID = r.ArticleID
														)
									  """;
	
	
	private  Connection connect() throws SQLException {
		try {
			Class.forName(PILOTE);
		} catch(ClassNotFoundException e) { e.printStackTrace();}
		return DriverManager.getConnection(URL, USER, PASSWD);
	}
	
	public ArrayList<String> getEmails(int articleID)  {
		ArrayList<String> emails = new ArrayList<>();
		
		try(Connection connection = connect()) {
			String email;
			
			PreparedStatement pstmt = connection.prepareStatement(GET_EMAILS);
			pstmt.setInt(1, articleID);
			
			ResultSet result = pstmt.executeQuery();
			
			while(result.next()) {
				email = result.getString("Email");
				emails.add(email);
			}
			connection.close();
		} catch (SQLException e) {e.printStackTrace();}
		return emails;
	}
}
