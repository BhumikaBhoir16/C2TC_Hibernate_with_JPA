package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "employee")

public class Employee implements Serializable
{
	
	private static final long serialVersionUID =1L;
	@Id
	private int EmpId;
	private String EmpName;
	private String EmpPhoneNo;
	
	
	public int getEmpId() {
		return EmpId;
	}
	
	
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	
	public String getEmpName() {
		return EmpName;
	}
	
	
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	
	
	public String getEmpPhoneNo() {
		return EmpPhoneNo;
	}
	
	
	public void setEmpPhoneNo(String empPhoneNo) {
		EmpPhoneNo = empPhoneNo;
	}
	
}


