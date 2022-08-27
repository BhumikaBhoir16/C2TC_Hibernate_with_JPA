package com.jpa.TablePerClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Employee
		Employee employee = new Employee();
		employee.setEmpName("Riya");
		employee.setEmpSalary(10000);
		em.persist(employee);
		
		//Manager
		Manager manager = new Manager();
		manager.setEmpName("Meera");
		manager.setEmpSalary(25000);
		manager.setDepartment("Sales");
		em.persist(manager);
		
		em.getTransaction().commit();
		
		System.out.println("Thankyou!");
		em.close();
		factory.close();
		
	}
		

}
