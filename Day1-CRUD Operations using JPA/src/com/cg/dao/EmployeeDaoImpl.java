package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDaoImpl  implements EmployeeDao{
	private EntityManager em;
	

	public EmployeeDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public void addEmployee(Employee emp) {
		em.persist(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
		
	}

	@Override
	public Employee getEmployeeByID(int ID) {
		Employee emp=em.find(Employee.class, ID);
		return emp;
	}

	@Override
	public void removeEmployee(Employee emp) {
		em.remove(emp);
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

}
