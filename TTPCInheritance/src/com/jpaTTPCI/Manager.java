package com.jpaTTPCI;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr")
public class Manager extends Employee{
	
	public static final long serialVersionUID = 1L;
	
	private String DepartmentName;

	
	public String getDepartmentName() 
	{
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) 
	{
		this.DepartmentName = departmentName;
	}

}
