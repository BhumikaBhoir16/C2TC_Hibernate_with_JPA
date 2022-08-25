package com.service;

import com.entity.Employee;

public interface EmployeeService 
{
	public abstract void addEmployee(Employee employee);
	
	public abstract Employee findEmployeeById(int EmpId);
	
	public abstract void updateEmployee(Employee employee);
	
	public abstract void removeEmployee(Employee employee);


}
