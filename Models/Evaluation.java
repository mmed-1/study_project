package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public class Evaluation {

	private String decision;
	private String recommandations;
	private String remarques;
	public PC m_PC;
	public Article m_Article;

	public Evaluation(){
		super();
		this.m_Article = new Article();
		this.m_PC = new PC();
	}
	
	

	public Evaluation(String decision, String recommandations, String remarques, PC m_PC, Article m_Article) {
		super();
		this.decision = decision;
		this.recommandations = recommandations;
		this.remarques = remarques;
		this.m_PC = m_PC;
		this.m_Article = m_Article;
	}

	
	

	public String getDecision() {
		return decision;
	}



	public void setDecision(String decision) {
		this.decision = decision;
	}



	public String getRecommandations() {
		return recommandations;
	}



	public void setRecommandations(String recommandations) {
		this.recommandations = recommandations;
	}



	public String getRemarques() {
		return remarques;
	}



	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}



	public PC getM_PC() {
		return m_PC;
	}



	public void setM_PC(PC m_PC) {
		this.m_PC = m_PC;
	}



	public Article getM_Article() {
		return m_Article;
	}



	public void setM_Article(Article m_Article) {
		this.m_Article = m_Article;
	}



	public void finalize() throws Throwable {

	}
}//end Evaluation