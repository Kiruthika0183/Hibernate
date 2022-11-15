package namedQuery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
{
	@NamedQuery(
		name="findCustomerByName",
	    query="from Customer c where c.cname=:cname"),
	@NamedQuery(
			name="findCustomerByCityStartWithC",
		    query="from Customer c where c.ccity like 'c%'")
			
})



@Entity
@Table(name="cust")
public class Customer {
	
	@Id
	@GeneratedValue
    private int cid;
	private String cname;
	private String ccity;
	private int cage;
	private int csalary;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCcity() {
		return ccity;
	}
	public void setCcity(String ccity) {
		this.ccity = ccity;
	}
	public int getCage() {
		return cage;
	}
	public void setCage(int cage) {
		this.cage = cage;
	}
	public int getCsalary() {
		return csalary;
	}
	public void setCsalary(int csalary) {
		this.csalary = csalary;
	}
	public Customer(int cid, String cname, String ccity, int cage, int csalary) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccity = ccity;
		this.cage = cage;
		this.csalary = csalary;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
