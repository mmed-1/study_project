package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:44 PM
 */
public class Decision {

	private boolean estAccepte;
	public Conference m_Conference;
	public Article m_Article;

	public Decision(){
		super();
	}

	
	
	public Decision(boolean estAccepte, Conference m_Conference, Article m_Article) {
		super();
		this.estAccepte = estAccepte;
		this.m_Conference = m_Conference;
		this.m_Article = m_Article;
	}

	


	public boolean isEstAccepte() {
		return estAccepte;
	}



	public void setEstAccepte(boolean estAccepte) {
		this.estAccepte = estAccepte;
	}



	public Conference getM_Conference() {
		return m_Conference;
	}



	public void setM_Conference(Conference m_Conference) {
		this.m_Conference = m_Conference;
	}



	public Article getM_Article() {
		return m_Article;
	}



	public void setM_Article(Article m_Article) {
		this.m_Article = m_Article;
	}



	public void finalize() throws Throwable {

	}
}//end Decision