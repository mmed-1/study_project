package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:44 PM
 */
public class Article {

	private String affiliations;
	private String id;
	private String nom;
	private String Resume;
	private String titrePapiers;
	public Auteur m_Auteur;
	
	
	public String getAffiliations() {
		return affiliations;
	}

	public void setAffiliations(String affiliations) {
		this.affiliations = affiliations;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getResume() {
		return Resume;
	}

	public void setResume(String resume) {
		Resume = resume;
	}

	public String getTitrePapiers() {
		return titrePapiers;
	}

	public void setTitrePapiers(String titrePapiers) {
		this.titrePapiers = titrePapiers;
	}

	public Auteur getM_Auteur() {
		return m_Auteur;
	}

	public void setM_Auteur(Auteur m_Auteur) {
		this.m_Auteur = m_Auteur;
	}

	public Article(){
		super();
	}

	public Article(String affiliations, String id, String nom, String resume, String titrePapiers, Auteur m_Auteur) {
		super();
		this.affiliations = affiliations;
		this.id = id;
		this.nom = nom;
		Resume = resume;
		this.titrePapiers = titrePapiers;
		this.m_Auteur = m_Auteur;
	}

	public void finalize() throws Throwable {

	}
}//end Article