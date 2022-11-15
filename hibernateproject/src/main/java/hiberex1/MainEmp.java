package hiberex1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.hibernateproject.Student;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		SessionFactory factory=new Configuration().configure().buildSessionFactory(); 
		Session session=factory.getCurrentSession();
		Transaction transaction=null;
		session=factory.openSession();
		transaction=session.beginTransaction();
		
		//insert records
		/*Employee e=new Employee(1,"shruthi","engineer","erode");
		session.save(e);
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("anushya");
		e1.setDesg("engineer");
		e1.setLocation("pondicherry");
		session.save(e1);
		
		Employee e3=new Employee(3,"nayahi","engineer","chennai");
		session.save(e3);
		Employee e4=new Employee(4,"swathi","engineer","chennai");
		session.save(e4);*/
		
		//update
		/*Employee e5=session.get(Employee.class,3);
		e5.setLocation("selam");
		session.save(e5);
		System.out.println("Updated Successfully..");*/
		
		//delete
		/*Employee e6=session.get(Employee.class, 3);
		session.delete(e6);
		System.out.println("Deleted Succesfully..");*/
		
		//fetch data
		/*System.out.println("Employee details:");
		Employee e7=session.get(Employee.class, 4);
		System.out.println("Id : " +e7.getId());
		System.out.println("Name : " +e7.getName());
		System.out.println("Desgn : " +e7.getDesg());
		System.out.println("Location : " +e7.getLocation());*/
		
		//display records
		Query q=session.createQuery("from Employee");
		List<Employee> l=q.list();
		for(Employee g:l) {
			System.out.println("Id : " +g.getId());
			System.out.println("Name : " +g.getName());
			System.out.println("Desgn : " +g.getDesg());
			System.out.println("Location : " +g.getLocation());
			
		}
		
		transaction.commit();
		session.close();
		
		

	}

}
