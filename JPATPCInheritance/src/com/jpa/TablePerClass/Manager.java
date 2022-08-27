package com.jpa.TablePerClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="mgr_store")
@DiscriminatorValue(value="Mgr")
public class Manager extends Employee{
	
	public static final long serialVersionUID = 1L;
	
	private String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

	

}
