package com.ty.controller;

import com.ty.dao.StudentDOA;
import com.ty.dto.Student;

public class StudentGet {

	public static void main(String[] args) {
		Student s=new Student();
		StudentDOA sd=new StudentDOA();
		s=sd.getStudent(1);
		if(s!=null) {
			System.out.println("roll no is:"+s.getRol());
			System.out.println("name is "+s.getName());
			System.out.println("Percentage is:"+s.getPercentage());
			}
			else {
				System.out.println("Enter valid details");
			}	

	}

}
