package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService {
	void  addEmployee(Employee emp);// to create
	void updateEmployee(Employee emp);//To update
	Employee getEmployeeByID(int ID);//To retrieve
	void removeEmployee(Employee emp);//to delete

}
