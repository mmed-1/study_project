package Models;


/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public class SC extends member {

	public SC m_SC;
	public Evaluation m_Evaluation;

	public SC(){
		super();
	}
	
	
	
	public SC(SC m_SC, Evaluation m_Evaluation) {
		super();
		this.m_SC = m_SC;
		this.m_Evaluation = m_Evaluation;
	}

	
	

	public SC getM_SC() {
		return m_SC;
	}



	public void setM_SC(SC m_SC) {
		this.m_SC = m_SC;
	}



	public Evaluation getM_Evaluation() {
		return m_Evaluation;
	}



	public void setM_Evaluation(Evaluation m_Evaluation) {
		this.m_Evaluation = m_Evaluation;
	}



	public void finalize() throws Throwable {
		super.finalize();
	}
}//end SC