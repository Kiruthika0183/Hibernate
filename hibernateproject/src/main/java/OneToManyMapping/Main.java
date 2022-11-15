package OneToManyMapping;

import java.util.ArrayList;
import java.util.List;

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
        
        Quest q=new Quest();
        q.setQid(1);
        q.setQname("Java Features");
        session.save(q);
        
        Ans a=new Ans();
        a.setAid(101);
        a.setAnswer("Platform-Independent");
        a.setQuestion(q);
        session.save(a);
        
        Ans a1=new Ans();
        a1.setAid(102);
        a1.setAnswer("Secure");
        a1.setQuestion(q);
        session.save(a1);
        
        Ans a2=new Ans();
        a2.setAid(103);
        a2.setAnswer("Multi-Threaded");
        a2.setQuestion(q);
        session.save(a2);
        
        Ans a3=new Ans();
        a3.setAid(104);
        a3.setAnswer("Portable");
        a3.setQuestion(q);
        session.save(a3);
        
        List<Ans> l= new ArrayList<Ans>();
        l.add(a);
        l.add(a1);
        l.add(a2);
        l.add(a3);
        q.setAnswer(l);
        
        
        transaction.commit();
        session.close();

	}

}
