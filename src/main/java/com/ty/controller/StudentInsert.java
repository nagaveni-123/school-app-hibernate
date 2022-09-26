package com.ty.controller;

import com.ty.dao.StudentDOA;
import com.ty.dto.Student;

public class StudentInsert {

	public static void main(String[] args) {
		Student s=new Student();
		  s.setName("Bavani");
		  s.setPercentage(75.5);
		  
		  StudentDOA sd=new StudentDOA();
		  sd.saveStudent(s);
	}

}
