package com.cg.empapp.dao;

import java.util.HashMap;

import com.cg.empapp.dto.Employee;
import com.cg.empapp.exception.EmployeeException;
import com.cg.empapp.ui.*;

/**
 * class to perform business logic
 */
public class EmployeeDaoImpl implements EmployeeDao{
	Client c= new Client();
	Employee emp = new Employee();
	
	/**
    * map to hold the data
    */
	private static HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();
	
    
    
    /**
    * getter for map
    */   
    public static void setMap(HashMap<Integer,Employee> map)
    {
		EmployeeDaoImpl.map=map;
    }  
    
    /**
     * Setter for the map
     */

    public static HashMap<Integer,Employee> getMap()
    {
		return map;
    }

	@Override
	public void insertEmployee(Employee emp) 
	{
		// TODO Auto-generated method stub
		map.put(emp.getEmpId(), emp);
		System.out.println("Employee Information stored successfully for EmpId : "+emp.getEmpId());
		
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() throws EmployeeException {
		if(map.isEmpty())
		{
			throw new EmployeeException("no records found");
		}
		else
		{   //getMap();
             return map;
		
		}
		
	}

	@Override
	public Employee getEmployeeById(int id) throws EmployeeException
	{
		
		if(map.containsKey(id))
	
		 emp = map.get(id);
			return emp;
			//System.out.println(emp.getEmpName()+emp.getEmpId()+emp.getEmpSal());
	
	
		
		
	}  

   

}