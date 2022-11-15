package OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SessionFactory factory=new Configuration().configure().buildSessionFactory();
	        Session session=factory.getCurrentSession();
	        org.hibernate.Transaction transaction=null;
	        session =factory.openSession();
	        transaction=session.beginTransaction();
	        
	        Question q=new Question();
	        q.setQid(1);
	        q.setQname("SQL stands for?");
	        
	        Answer a=new Answer();
	        a.setAid(101);
	        a.setSolution("Structured Query Language");
	        
	        q.setAns(a);
	        
	        session.save(q);
	        session.save(a);
	        
	        transaction.commit();
	        session.close();

	}

}
