package hibernate.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class JpaCrudOperation
{
	public void insertRecord(Bank b)
	{
		EntityManager entityManager = JPAutil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(b); // used to insert data into database
		entityManager.getTransaction().commit();
		entityManager.clear();
		System.out.println("Record Successfully inserted into Database");

	}
	public void deleteRecordById(int id)
	{
		EntityManager entityManager = JPAutil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Bank b = entityManager.find(Bank.class, id);
		entityManager.remove(b);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Record deleted Successfully from database");

	}
	public void updateRecordById(int id, String name) {
		EntityManager entityManager = JPAutil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Bank b = entityManager.find(Bank.class, id);
		b.setBname(name);

		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Record updated Successfully into database");

	}
	public void fetchAllRecords() {
		EntityManager entityManager = JPAutil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		List<Bank> bankList = new ArrayList<Bank>();
		bankList = entityManager.createQuery("FROM Bank").getResultList();
		if (bankList == null) {
			System.out.println("No Record Found");
		} else {
			for (Bank b : bankList) {
				System.out.println("bank id :: "+b.getBid() );
				System.out.println("bank name :: " + b.getBname());
			}
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Records Successfully fetch from database");
	}



}
