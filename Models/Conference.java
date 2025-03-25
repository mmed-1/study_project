package Models;

import java.time.LocalDate;

/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:44 PM
 */
public class Conference {

	private String acronymeConf;
	private LocalDate dateDebutConf;
	private LocalDate dateFinConf;
	private LocalDate dateNotificationAuteur;
	private LocalDate dateSoumPapier;
	private String id;
	private String lieuConf;
	private String logo;
	private String siteWebConf;
	private String thematique;
	private String type;
	public Topics m_Topics;

	public Conference(){
		super();
	}
	
	

	public Conference(String acronymeConf, LocalDate dateDebutConf, LocalDate dateFinConf,
			LocalDate dateNotificationAuteur, LocalDate dateSoumPapier, String id, String lieuConf, String logo,
			String siteWebConf, String thematique, String type, Topics m_Topics) {
		super();
		this.acronymeConf = acronymeConf;
		this.dateDebutConf = dateDebutConf;
		this.dateFinConf = dateFinConf;
		this.dateNotificationAuteur = dateNotificationAuteur;
		this.dateSoumPapier = dateSoumPapier;
		this.id = id;
		this.lieuConf = lieuConf;
		this.logo = logo;
		this.siteWebConf = siteWebConf;
		this.thematique = thematique;
		this.type = type;
		this.m_Topics = m_Topics;
	}

	
	public String getAcronymeConf() {
		return acronymeConf;
	}



	public void setAcronymeConf(String acronymeConf) {
		this.acronymeConf = acronymeConf;
	}



	public LocalDate getDateDebutConf() {
		return dateDebutConf;
	}



	public void setDateDebutConf(LocalDate dateDebutConf) {
		this.dateDebutConf = dateDebutConf;
	}



	public LocalDate getDateFinConf() {
		return dateFinConf;
	}



	public void setDateFinConf(LocalDate dateFinConf) {
		this.dateFinConf = dateFinConf;
	}



	public LocalDate getDateNotificationAuteur() {
		return dateNotificationAuteur;
	}



	public void setDateNotificationAuteur(LocalDate dateNotificationAuteur) {
		this.dateNotificationAuteur = dateNotificationAuteur;
	}



	public LocalDate getDateSoumPapier() {
		return dateSoumPapier;
	}



	public void setDateSoumPapier(LocalDate dateSoumPapier) {
		this.dateSoumPapier = dateSoumPapier;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getLieuConf() {
		return lieuConf;
	}



	public void setLieuConf(String lieuConf) {
		this.lieuConf = lieuConf;
	}



	public String getLogo() {
		return logo;
	}



	public void setLogo(String logo) {
		this.logo = logo;
	}



	public String getSiteWebConf() {
		return siteWebConf;
	}



	public void setSiteWebConf(String siteWebConf) {
		this.siteWebConf = siteWebConf;
	}



	public String getThematique() {
		return thematique;
	}



	public void setThematique(String thematique) {
		this.thematique = thematique;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public Topics getM_Topics() {
		return m_Topics;
	}



	public void setM_Topics(Topics m_Topics) {
		this.m_Topics = m_Topics;
	}



	public void finalize() throws Throwable {

	}
}//end Conference