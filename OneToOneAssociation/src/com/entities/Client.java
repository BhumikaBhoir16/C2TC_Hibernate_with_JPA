package com.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	    EntityManager em = factory.createEntityManager();
	    em.getTransaction().begin();
	    Student student = new Student(); //student object
	    student.setName("Nitesh Patil");
	    student.setStudentId(10);
	    
	    Address homeAddress = new Address();
	    homeAddress.setStreet("Tilak Galli");
	    homeAddress.setCity("Mumbai");
	    homeAddress.setState("MH");
	    homeAddress.setZipcode("005");
	    
	    //inject address into student
	    student.setAddress(homeAddress);
	    
	    //persist only student, no need to persist address explicitly
	    em.merge(student);
	    em.getTransaction().commit();
	    
	    System.out.println("Added One student data");
	    em.close();
	    factory.close();

	}

}
