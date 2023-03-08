package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Employee e3 = new Employee();
		e3.setId(161);
		e3.setName("ABC");
		e3.setSalary(3500.70f);
		em.persist(e3);

		//second emp
		Employee e4 = new Employee();
		e4.setId(162);
		e4.setName("XYZ");
		e4.setSalary(3000.70f);
		em.persist(e4);
		
		Manager m = new Manager();
		m.setId(602);
		m.setName("PQRS");
		m.setSalary(52000.45f);
		m.setDept_id(45);
		m.setDept_Name("Finance");
		em.persist(m);
		em.getTransaction().commit();
		
		System.out.println("Data Added SuccessFully!");
	
	}

}
