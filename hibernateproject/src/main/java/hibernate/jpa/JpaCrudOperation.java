package hibernate.jpa;

import javax.persistence.EntityManager;

public class JpaCrudOperation {
	public void insertRecord(Bank b) {
		EntityManager entityManager = JPAutil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(b); // used to insert data into database
		entityManager.getTransaction().commit();
		entityManager.clear();
		System.out.println("Record Successfully inserted in to Database");

	}



}
