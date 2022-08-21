package com.cg.JoinInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinTableInheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		EmployeeK emp4=new EmployeeK();
		emp4.setName("Neha");
		emp4.setSalary(15000);
		em.persist(emp4);// to add the row
		
		//create second Employee
		EmployeeK emp5=new EmployeeK();
		emp5.setName("Vidya");
		emp5.setSalary(35000);
		em.persist(emp5);
		
		//create one manager
		ManagerK m2=new ManagerK();
		m2.setName("Sneha");
		m2.setSalary(50000);
		m2.setDeptName("HR");
		em.persist(m2);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the Database");
		em.close();
		factory.close();

	}

}