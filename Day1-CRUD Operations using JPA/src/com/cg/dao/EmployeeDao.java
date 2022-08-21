package com.cg.dao;

import com.cg.entities.Employee;

public interface EmployeeDao
{
void  addEmployee(Employee emp);// to create
void updateEmployee(Employee emp);//To update
Employee getEmployeeByID(int ID);//To retrieve
void removeEmployee(Employee emp);// to delete
void commitTransaction();
void beginTransaction();
}
