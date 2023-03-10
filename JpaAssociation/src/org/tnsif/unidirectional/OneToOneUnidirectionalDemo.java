
//driver class
//program to demonstrate on OneToOne Unidirectional association

package org.tnsif.unidirectional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUnidirectionalDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first employee
		Employee emp3=new Employee();
		emp3.setEmpname("Shital Moule");
		
		//second employee
		Employee emp4=new Employee();
		emp4.setEmpname("Vaibhav Karkute");
		
		//first address
		Address a1=new Address();
		a1.setPincode(440018);
		a1.setArea("Ganeshpeth");
		a1.setCity("Nagpur");
		a1.setState("Maharashtra");
		
		//second address
		Address a2=new Address();
		a2.setPincode(411014);
		a2.setArea("Airoli");
		a2.setCity("Mumbai");
		a2.setState("Maharashtra");
		
		emp3.setAddress(a1);
		emp4.setAddress(a2);
		
		em.persist(emp3);
		em.persist(emp4);
		
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();
	}

}