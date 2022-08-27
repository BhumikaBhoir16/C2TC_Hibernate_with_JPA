package com.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//Create one Student
	    Student student = new Student();
		student.setStudentId(18);
		student.setName("Riyan");
		student.setMarks(80.00);
		em.merge(student);
		
		//create on senior student
		SeniorStudent seniorStudent = new SeniorStudent();
		seniorStudent.setStudentId(26);
		seniorStudent.setName("Surabh");
		seniorStudent.setMarks(90.50);
		seniorStudent.setDivisionName("A");
		em.merge(seniorStudent);
		
		
        em.getTransaction().commit();
		
        System.out.println("Thank You!");
		em.close();
		factory.close();
		
		
	}

}
