package hibernate.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private int bid;
	private String bname;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Bank(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
