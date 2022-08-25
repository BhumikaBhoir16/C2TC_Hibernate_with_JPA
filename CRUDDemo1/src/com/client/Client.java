package com.client;

import com.entity.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args)
	{
		//CRUD operation calling activity
		Employee employee = new Employee();
		
		EmployeeService service = new EmployeeServiceImpl();
		
		
		//create operation
		
		/*employee.setEmpId(2);
		employee.setEmpName("Niya");
		employee.setEmpPhoneNo("9156784596");
		service.addEmployee(employee);*/
		
		
		//Retrieve operation
		
	//	employee=service.findEmployeeById(1);
	//	System.out.println("Employee Id is " +employee.getEmpId());
	//	System.out.println("Employee Name is "+employee.getEmpName());
	//	System.out.println("Employee phone number is "+employee.getEmpPhoneNo()); 
		
		
		//update operation
		//employee = service.findEmployeeById(1);
	//	employee.setEmpName("Rachana");
	//	service.updateEmployee(employee);
		
		
		//service.findEmployeeById(2);
		//System.out.println("Employee Id is " +employee.getEmpId());
		//System.out.println("Employee Name is "+employee.getEmpName());
		
		
		//Delete operation
		
		employee = service.findEmployeeById(2);
		service.removeEmployee(employee);
		System.out.println("Row Removed");
		
		
		
	    System.out.println("Thank you!");

}

}


