package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:44 PM
 */
public class DomaineExpertise {

	private String domaineRecherche;

	public DomaineExpertise(){
		super();
	}
	
	

	public DomaineExpertise(String domaineRecherche) {
		super();
		this.domaineRecherche = domaineRecherche;
	}

	

	public String getDomaineRecherche() {
		return domaineRecherche;
	}



	public void setDomaineRecherche(String domaineRecherche) {
		this.domaineRecherche = domaineRecherche;
	}



	public void finalize() throws Throwable {

	}
}//end DomaineExpertise