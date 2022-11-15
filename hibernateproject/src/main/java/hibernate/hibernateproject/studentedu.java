package hibernate.hibernateproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="StudentEdubridge")
public class studentedu {
	@Id
	@GeneratedValue

	private int id;
	
	@Column(name="sname",length=10,nullable=false,unique=true)
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public studentedu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public studentedu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
