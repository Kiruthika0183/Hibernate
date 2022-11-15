package hibernate.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppMain
{
	
	/*private static final EntityManagerFactory emFactoryObj;
	private static final String PERSISTENCE_UNIT_NAME = "JPADemo";

	static {
		emFactoryObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	// This Method Is Used To Retrieve The 'EntityManager' Object
	public static EntityManager getEntityManager() {
		return emFactoryObj.createEntityManager();
	}
	*/
	public static void main(String[] args) 
	{
		JpaCrudOperation jc=new JpaCrudOperation();
		Bank b = new Bank(2,"HDFC");
		//jc.insertRecord(b);*/
		
		//jc.deleteRecordById(2);
		//jc.updateRecordById(1, "ICICI");
		
		jc.fetchAllRecords();
		/*EntityManager em=getEntityManager();
		em.getTransaction().begin();
		Bank b = new Bank(1,"SBI");
		em.persist(b);
		em.getTransaction().commit();
		
		System.out.println("Inserted...");*/
	}

}
