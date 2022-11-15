package ManyToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int eid;
	private String ename;
	private String edesg;
	
	@ManyToMany
	private List<Project> prj;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesg() {
		return edesg;
	}

	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}

	public List<Project> getPrj() {
		return prj;
	}

	public void setPrj(List<Project> prj) {
		this.prj = prj;
	}

	public Employee(int eid, String ename, String edesg, List<Project> prj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edesg = edesg;
		this.prj = prj;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
