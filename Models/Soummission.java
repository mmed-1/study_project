package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public class Soummission {

	private String soummissionId;
	public Auteur m_Auteur;
	public Article m_Article;

	public Soummission(){
		super();
	}

	
	
	public String getSoummissionId() {
		return soummissionId;
	}



	public void setSoummissionId(String soummissionId) {
		this.soummissionId = soummissionId;
	}



	public Auteur getM_Auteur() {
		return m_Auteur;
	}



	public void setM_Auteur(Auteur m_Auteur) {
		this.m_Auteur = m_Auteur;
	}



	public Article getM_Article() {
		return m_Article;
	}



	public void setM_Article(Article m_Article) {
		this.m_Article = m_Article;
	}



	public Soummission(String soummissionId, Auteur m_Auteur, Article m_Article) {
		super();
		this.soummissionId = soummissionId;
		this.m_Auteur = m_Auteur;
		this.m_Article = m_Article;
	}



	public void finalize() throws Throwable {

	}
}//end Soummission