package com.cg.empapp.ui;

import java.util.*;

import com.cg.empapp.dto.Employee;
import com.cg.empapp.exception.EmployeeException;
import com.cg.empapp.service.EmployeeServiceImpl;
public class Client 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		BookRecord br = new BookRecord();
		while(true)
		{
			System.out.println("1-Add Employee");
			System.out.println("2-Get All Employee Details");
			System.out.println("3-Get Employee By Id");
			System.out.println("4-Exit");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:
					//System.out.println("1-Add Employee");
					br.addRecord();
					break;
				case 2:
					//System.out.println("2-Get All Employee Details");
				try {
					br.allDetails();
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
				case 3:
					//System.out.println("3-Get Employee By Id");
				try {
					br.retriveId();
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
				case 4:
					System.out.println("End");
					System.exit(0);
					break;
				default:
					System.out.println("Enter correct choice");
					break;
					
			}
			
		}
		
	}
	
	/*public Employee printall(Employee emp)
	{
		System.out.println(emp.getEmpId()+emp.getEmpName()+emp.getEmpSal());
		return emp;
		
	}*/
}
	
 class BookRecord
{
	Scanner s;
	Employee emp;
	EmployeeServiceImpl es;
	
	public BookRecord()
	{
		emp = new Employee();
		es = new EmployeeServiceImpl();
	}
	public void addRecord()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Employee Details");
		System.out.println("Enter the Employee Id ");
		int id=s.nextInt();
		System.out.println("Enter the Employee name ");
		String name=s.next();
		System.out.println("Enter the Employee Salary ");
		int salary=s.nextInt();
		emp = new Employee(id,name,salary);
		es.insertEmployee(emp);
		
	}
	
	public void retriveId() throws EmployeeException
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Employee Id Which You Want To Retrive ");
		System.out.println("Enter the Employee Id ");
		int id=s.nextInt();
		System.out.println(es.getEmployeeById(id));
	}
	
	public void allDetails() throws EmployeeException
	{
		System.out.println(es.getAllEmployees());
	}
}

