package com.dao;

import com.entity.Employee;

public interface EmployeeDao 
{
	// CRUD Operation
	
	public abstract void addEmployee(Employee employee);
	
	public abstract Employee getEmployeeById(int EmpId);
	
	public abstract void updateEmployee(Employee employee);
	
	public abstract void removeEmployee(Employee employee);
	
	
	
	public abstract void commitTransaction();
	
	public abstract void beginTransaction();

	

}
