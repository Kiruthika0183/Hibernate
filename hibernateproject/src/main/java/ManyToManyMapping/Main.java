package ManyToManyMapping;

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
     
        Employee e=new Employee();
        e.setEid(101);
        e.setEname("kiruthika");
        e.setEdesg("Developer");
        //session.save(e);
        
        Employee e1=new Employee();
        e1.setEid(102);
        e1.setEname("priyadharshini");
        e1.setEdesg("Developer");
        //session.save(e1);
        
        Employee e2=new Employee();
        e2.setEid(103);
        e2.setEname("kowsi");
        e2.setEdesg("Developer");
        //session.save(e2);
      
        List<Employee> elist=new ArrayList<Employee>();
        elist.add(e);
        elist.add(e1);
        elist.add(e2);
       
        Project p=new Project();
        p.setPid(1);
        p.setPname("Spring");
        p.setEmp(elist);
        session.save(p);
        
        Project p1=new Project(2,"Core Java",null);
        p1.setEmp(elist);
        session.save(p1);
        
        Project p2=new Project();
        p2.setPid(3);
        p2.setPname("SQL");
        p2.setEmp(elist);
        session.save(p2);
        
        
        List<Project> plist=new ArrayList<Project>();
        plist.add(p);
        plist.add(p1);
        plist.add(p2);
        
        e.setPrj(plist);
        e1.setPrj(plist);
        e2.setPrj(plist);
        
        session.save(e);
        session.save(e1);
        session.save(e2);
        
        

        
        transaction.commit();
        session.close();

	}

}
