package namedQuery;

import java.util.Arrays;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.getCurrentSession();
        org.hibernate.Transaction transaction=null;
        session =factory.openSession();
        transaction=session.beginTransaction();
        
       /* Customer c1=new Customer();
        c1.setCname("abhi");
        c1.setCage(21);
        c1.setCcity("chennai");
        c1.setCsalary(24000);
        session.save(c1);
        
        Customer c2=new Customer();
        c2.setCname("mahi");
        c2.setCage(24);
        c2.setCcity("banglore");
        c2.setCsalary(25000);
        session.save(c2);
        
        //Customer c3=new Customer(3,"sowmi",23,"chennai",30000);
        
        Customer c3=new Customer();
        c3.setCname("sowmi");
        c3.setCage(23);
        c3.setCcity("chennai");
        c3.setCsalary(30000);
        session.save(c3);
        
        Customer c4=new Customer();
        c4.setCname("kiruthi");
        c4.setCage(21);
        c4.setCcity("trichy");
        c4.setCsalary(23000);
        session.save(c4);*/
       
        /*TypedQuery query = session.getNamedQuery("findCustomerByName");
        query.setParameter("cname","kiruthi");
        List<Customer> c=((Query) query).list();
        for(int i=0;i<c.size();i++) {
        	System.out.println("Customer name :"+c.get(i).getCname());
        
        }
        
        TypedQuery query1 = session.getNamedQuery("findCustomerByCityStartWithC");
        
        List<Customer> cc=((Query) query1).list();
        System.out.println("Customer city starts with c :");
        for(int i=0;i<cc.size();i++) {
        	System.out.println(cc.get(i).getCcity());
       
        }*/
        
        /* Query q1 = session.createQuery("select sum(csalary) from Customer");
        System.out.println("Sum : "+q1.list().get(0));*/
        
       /* Query q1 = session.createQuery("select count(*) from Customer");
        System.out.println("Count : "+q1.list().get(0));
        
       Query q11 = session.createQuery("select count(distinct ccity) from Customer");
        List<Customer> l1 = q11.list();
        System.out.println("Count : "+q11.list().get(0));
        
        Query q2 = session.createQuery("select count(cid),ccity from Customer group by ccity having count(cid)=1");
        List<Object[]> list = q2.list();
        for(Object[] arr: list)
        {
        	System.out.println(Arrays.toString(arr));
        }
        
        Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> cList = criteria.list();
		for(Customer cs : cList){
			System.out.println("ID="+cs.getCid()); 
		}*/
		
		/*int sumSalary = (Integer) session.createCriteria(Customer.class)
				.setProjection(Projections.sum("csalary"))
				.uniqueResult();
			System.out.println("Sum of Salaries="+sumSalary);*/
        
        Query q12 = session.createQuery("select cname from Customer where cage>21 ");
        List<Customer> ql = q12.list();
        for(Customer cs :ql){
			//System.out.println("ID="+cs.getCid()); 
        
        System.out.println(" customers have cage>21 : "+cs.getCage());

        }

       




      
        transaction.commit();
        session.close();

	}

}
