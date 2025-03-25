package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public class PC extends member {

	private int nbEvaCompletee;
	private int nbSoumAssignes;

	public PC(){
		super();
	}
	
	public PC(int nbEvaCompletee, int nbSoumAssignes) {
		super();
		this.nbEvaCompletee = nbEvaCompletee;
		this.nbSoumAssignes = nbSoumAssignes;
	}

	public int getNbEvaCompletee() {
		return nbEvaCompletee;
	}

	public void setNbEvaCompletee(int nbEvaCompletee) {
		this.nbEvaCompletee = nbEvaCompletee;
	}

	public int getNbSoumAssignes() {
		return nbSoumAssignes;
	}

	public void setNbSoumAssignes(int nbSoumAssignes) {
		this.nbSoumAssignes = nbSoumAssignes;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end PC