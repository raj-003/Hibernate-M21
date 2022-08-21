package com.cg.client;

import com.cg.entities.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		EmployeeService service=new EmployeeServiceImpl();
		Employee emp = new Employee();
		emp.setID(2);
		emp.setNAME("PQRS");
		service.addEmployee(emp);
	}

}
