package OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ans {
	@Id
	private int aid;
	private String answer;
	
	@ManyToOne
	private Quest question;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Quest getQuestion() {
		return question;
	}

	public void setQuestion(Quest question) {
		this.question = question;
	}

	public Ans(int aid, String answer, Quest question) {
		super();
		this.aid = aid;
		this.answer = answer;
		this.question = question;
	}

	public Ans() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
