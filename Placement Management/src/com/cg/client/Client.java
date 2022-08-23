package com.cg.client;

import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		Student std = new Student();
		StudentService service = new StudentServiceImpl();
	// creating DB
	
		
	    std.setID(7);
		std.setNAME("SHABNAM");
		std.setROLLNO(99);
		std.setQUALIFICATION("BE");
		std.setCOURSE("CSE");
		std.setYEAR(2022);
		std.setCERTIFICATE("JAVA-Full Stack");
		std.setHALLTICKET(145);
		std.setCOLLEGE("JSCOE");
		service.addStudent(std);
		
		//Retrieve
		/*std =service.searchStudentByID(2);
		System.out.println("ID is " +std.getID());
		System.out.println("NAME is "+std.getNAME());
		System.out.println("COLLEGE is "+std.getCOLLEGE());*/
		
		//Update
		/*std = service.searchStudentByID(7);
		std.setROLLNO(109);
		service.updateStudent(std);*/
		
		
		//Delete
		/*std= service.searchStudentByID(7);
		service.deleteStudent(std);*/
		
		
		
	}

}
