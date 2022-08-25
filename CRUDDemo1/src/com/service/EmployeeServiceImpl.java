package com.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService
{
   private EmployeeDao dao;
   
   public EmployeeServiceImpl()
   {
	   dao = new EmployeeDaoImpl();
   }

@Override
public void addEmployee(Employee employee) 
{
	dao.beginTransaction();
	dao.addEmployee(employee);
	dao.commitTransaction();
	
}

@Override
public Employee findEmployeeById(int EmpId)
{
	Employee employee = dao.getEmployeeById(EmpId);
	return employee;
}

@Override
public void updateEmployee(Employee employee)
{
	dao.beginTransaction();
	dao.updateEmployee(employee);
	dao.commitTransaction();
	
}

@Override
public void removeEmployee(Employee employee)
{
	dao.beginTransaction();
	dao.removeEmployee(employee);
	dao.commitTransaction();
	
}

}
