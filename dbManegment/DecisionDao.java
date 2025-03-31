package dbManegment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DecisionDao {
	
	private final String URL = "jdbc:mysql://127.0.0.1:3306/project";
	private final String USER = "root";
	private final String PASSWD = "ur password";
	private final String PILOTE = "com.mysql.cj.jdbc.Driver";
	
	private final String INSERT_DECISION = """
												INSERT INTO decision (ArticleID, ConferenceID, EstAccepte)
												VALUES (?, ?, ?)
										 """;
	
	private Connection connect() throws SQLException {
		try {
			Class.forName(PILOTE);
		} catch(ClassNotFoundException e) { e.printStackTrace();}
		return DriverManager.getConnection(URL, USER, PASSWD);
	}
	
	public boolean saveTheDecision(int articleID, int conferenceID, boolean isAccepted) {
		try(Connection connection = this.connect()) {
			
			System.out.println("You are inside th DataBase");
			PreparedStatement pstmt = connection.prepareStatement(INSERT_DECISION);
			pstmt.setInt(1, articleID);
			pstmt.setInt(2, conferenceID);
			pstmt.setBoolean(3, isAccepted);
			
			int rowsAffected = pstmt.executeUpdate();
			return rowsAffected == 1;
			
		} catch(SQLException e) {e.printStackTrace();}
		
		return false;
	}
}
