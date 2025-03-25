package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public abstract class User {

	protected String email;
	protected String id;
	protected String nom;
	protected String Password;
	protected String prenom;

	public User(){
		super();
	}
	
	
	
	public User(String email, String id, String nom, String password, String prenom) {
		super();
		this.email = email;
		this.id = id;
		this.nom = nom;
		Password = password;
		this.prenom = prenom;
	}

	


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
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



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public void finalize() throws Throwable {

	}
}//end User