package com.cg.empapp.dto;

public class Employee {

	
	private int empId;
	private String empName;
	private int empSal;


	public Employee(int empId, String empName, int empSal) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}


	public Employee() 
	{
		
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpSal() {
		return empSal;
	}


	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}


	@Override
	public String toString() {
		return "empId=" + empId+"\n" + ", empName=" + empName +"\n" + ", empSal=" + empSal+"\n";
	}
	
	
	
}
