package kodnest.com.daoPersist;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	EmployeeDAOimpl ref=new EmployeeDAOimpl();
    	
    	//First operation
    	/*List<Employee> emplist=ref.getEmployees();
    	for(Employee employee:emplist)
    	{
    		System.out.println(employee);
    	}*/
    	
    	//second operation
    	/*Employee emp=ref.getEmployeeById(2);
    	System.out.println(emp);*/
    	
    	//Third operation
        /*Employee e=new Employee("Boda", "IT");
        String status=ref.persistEmployee(e);
    	System.out.println(status);*/
    	
    	//Fourth operation
    	/*Employee e=ref.getEmployeeById(3);
    	String res=ref.deleteEmployee(e);
    	System.out.println(res);*/
    	
    	//Fifth operation
    	Employee e=ref.getEmployeeById(1);
    	e.setDepartment("Sales");
    	String res=ref.updateEmployee(e);
    	System.out.println(res);
    }
}
