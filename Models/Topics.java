package Models;

import java.util.ArrayList;

/**
 * @author Admin
 * @version 1.0
 * @created 23-Mar-2025 10:37:45 PM
 */
public class Topics {

	private int id;
	private ArrayList<String> sousTopics;
	private String topic;

	public Topics(){
		super();
	}
	
	
	
	public Topics(int id, ArrayList<String> sousTopics, String topic) {
		super();
		this.id = id;
		this.sousTopics = sousTopics;
		this.topic = topic;
	}

	


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public ArrayList<String> getSousTopics() {
		return sousTopics;
	}



	public void setSousTopics(ArrayList<String> sousTopics) {
		this.sousTopics = sousTopics;
	}



	public String getTopic() {
		return topic;
	}



	public void setTopic(String topic) {
		this.topic = topic;
	}



	public void finalize() throws Throwable {

	}
}//end Topics