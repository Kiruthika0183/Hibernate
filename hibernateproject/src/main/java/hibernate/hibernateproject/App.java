package hibernate.hibernateproject;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.getCurrentSession();
        org.hibernate.Transaction transaction=null;
        session =factory.openSession();
        transaction=session.beginTransaction();
        
        //insert record
       /* Student s=new Student(1,"kiruthi");
        session.save(s);
        
        Student s1=new Student();
        s1.setId(2);
        s1.setName("Anu");
        session.save(s1);*/
        
        //fetch data
        /* System.out.println("Student Details ");
        Student s2=session.get(Student.class, 1);
        System.out.println("Id:" +s2.getId());
        System.out.println("Name:" +s2.getName());*/
       
        
        //update record
      /*  Student s1=session.get(Student.class, 1);
        s1.setName("deebi");
        session.save(s1);
        System.out.println("Record is updated Successfully...");*/
        
        //delete record
         /*Student s2=session.get(Student.class, 2);
         session.delete(s2);
         System.out.println("Record is Deleted Successfully...");*/
        
        //display records
        org.hibernate.Query q=session.createQuery("from Student");
        List <Student> l=q.list();
        for(Student s:l) {
        	 System.out.println("Id:" +s.getId());
             System.out.println("Name:" +s.getName());
        	
        }
       
        transaction.commit();
        session.close();
          
             
    }
}
