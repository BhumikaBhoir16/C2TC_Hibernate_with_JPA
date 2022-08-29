package com.jpaTTPCI;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Employee
		Employee emp = new Employee();
		emp.setName("Yasmit");
		emp.setSalary(22000);
		em.persist(emp);
		
		//Manager
		Manager mgr = new Manager();
		mgr.setName("Krutik");
		mgr.setSalary(25000);
		mgr.setDepartmentName("Sales");
		em.persist(mgr);
		
		em.getTransaction().commit();
		
		System.out.println("Thank You!");
		em.close();
		factory.close();

	}


}
