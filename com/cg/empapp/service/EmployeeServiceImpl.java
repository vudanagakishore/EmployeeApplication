package com.cg.empapp.service;

import java.util.HashMap;

import com.cg.empapp.dao.EmployeeDaoImpl;
import com.cg.empapp.dto.Employee;
import com.cg.empapp.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService
{
	EmployeeDaoImpl ed;
	Employee emp;
	public EmployeeServiceImpl()
	{
		 ed = new EmployeeDaoImpl();
		 emp = new Employee();
	}
	@Override
	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		ed.insertEmployee(emp);
		
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() throws EmployeeException {
		HashMap<Integer, Employee> map=ed.getAllEmployees();
		return map;
		
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException 
	{	
		

       emp= ed.getEmployeeById(id);
       return emp;
   
	}
	
	
}