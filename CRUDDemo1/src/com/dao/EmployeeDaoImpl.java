package com.dao;

import javax.persistence.EntityManager;

import com.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	private EntityManager entityManager;
	
	public EmployeeDaoImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee employee)
	{
		entityManager.persist(employee);	
	}

	@Override
	public Employee getEmployeeById(int empId) 
	{
		Employee employee = entityManager.find(Employee.class, empId);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee)
	{
		entityManager.merge(employee);	
		
	}

	@Override
	public void removeEmployee(Employee employee)
	{
		entityManager.remove(employee);	
		
	}

	@Override
	public void commitTransaction()
	{
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() 
	{
		entityManager.getTransaction().begin();
		
	}

}
