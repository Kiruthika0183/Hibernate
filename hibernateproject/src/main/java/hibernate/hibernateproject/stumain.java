package hibernate.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class stumain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.getCurrentSession();
        org.hibernate.Transaction transaction=null;
        session =factory.openSession();
        transaction=session.beginTransaction();
        
        studentedu s=new studentedu();
        s.setName("swathi");
        session.save(s);
        
        studentedu s1=new studentedu();
        s1.setName("deva");
        session.save(s1);
        
        studentedu s3=new studentedu();
        s3.setName("shri");
        session.save(s3);
        
        studentedu s4=new studentedu();
        s4.setName("gayu");
        session.save(s4);
        
        
        transaction.commit();
        session.close();
           

	}

}
