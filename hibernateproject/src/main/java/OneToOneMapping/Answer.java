package OneToOneMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {
	
	@Id
	private int aid;
	private String solution;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public Answer(int aid, String solution) {
		super();
		this.aid = aid;
		this.solution = solution;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
