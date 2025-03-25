package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public class President extends User {

	public Conference m_Conference;

	public President(){
		super();
	}
	
	

	public President(Conference m_Conference) {
		super();
		this.m_Conference = m_Conference;
	}
	
	


	public Conference getM_Conference() {
		return m_Conference;
	}



	public void setM_Conference(Conference m_Conference) {
		this.m_Conference = m_Conference;
	}



	public void finalize() throws Throwable {
		super.finalize();
	}
}//end President