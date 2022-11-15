package OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Quest {
	@Id
	private int qid;
	private String qname;
	
	@OneToMany
	private List<Ans> answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Ans> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Ans> answer) {
		this.answer = answer;
	}

	public Quest(int qid, String qname, List<Ans> answer) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answer = answer;
	}

	public Quest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
