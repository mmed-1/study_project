package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public abstract class member extends User {

	protected String Biographie;
	protected String Domaine_d_expertise;
	protected String Institution;
	protected String Pays;
	protected String Site_web_personnel;
	protected String Titre;
	public DomaineExpertise m_DomaineExpertise;
	public Conference m_Conference;

	public member(){
		super();
	}
	
	

	public member(String biographie, String domaine_d_expertise, String institution, String pays,
			String site_web_personnel, String titre, DomaineExpertise m_DomaineExpertise, Conference m_Conference) {
		super();
		Biographie = biographie;
		Domaine_d_expertise = domaine_d_expertise;
		Institution = institution;
		Pays = pays;
		Site_web_personnel = site_web_personnel;
		Titre = titre;
		this.m_DomaineExpertise = m_DomaineExpertise;
		this.m_Conference = m_Conference;
	}

	
	


	public String getBiographie() {
		return Biographie;
	}



	public void setBiographie(String biographie) {
		Biographie = biographie;
	}



	public String getDomaine_d_expertise() {
		return Domaine_d_expertise;
	}



	public void setDomaine_d_expertise(String domaine_d_expertise) {
		Domaine_d_expertise = domaine_d_expertise;
	}



	public String getInstitution() {
		return Institution;
	}



	public void setInstitution(String institution) {
		Institution = institution;
	}



	public String getPays() {
		return Pays;
	}



	public void setPays(String pays) {
		Pays = pays;
	}



	public String getSite_web_personnel() {
		return Site_web_personnel;
	}



	public void setSite_web_personnel(String site_web_personnel) {
		Site_web_personnel = site_web_personnel;
	}



	public String getTitre() {
		return Titre;
	}



	public void setTitre(String titre) {
		Titre = titre;
	}



	public DomaineExpertise getM_DomaineExpertise() {
		return m_DomaineExpertise;
	}



	public void setM_DomaineExpertise(DomaineExpertise m_DomaineExpertise) {
		this.m_DomaineExpertise = m_DomaineExpertise;
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
}//end member