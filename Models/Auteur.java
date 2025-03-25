package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:44 PM
 */
public class Auteur extends User {

	private String Organisation;
	private String Pays;
	private String siteWebPro;

	public Auteur(){
		super();
	}
	
	public Auteur(String organisation, String pays, String siteWebPro) {
		super();
		Organisation = organisation;
		Pays = pays;
		this.siteWebPro = siteWebPro;
	}

	public String getOrganisation() {
		return Organisation;
	}

	public void setOrganisation(String organisation) {
		Organisation = organisation;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public String getSiteWebPro() {
		return siteWebPro;
	}

	public void setSiteWebPro(String siteWebPro) {
		this.siteWebPro = siteWebPro;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Auteur