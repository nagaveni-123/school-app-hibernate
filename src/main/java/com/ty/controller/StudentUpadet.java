package com.ty.controller;

import com.ty.dao.StudentDOA;
import com.ty.dto.Student;

public class StudentUpadet {
	public static void main(String[] args) {
		Student st=new Student();
		StudentDOA sd=new StudentDOA();
		
		st.setRol(1);
		st.setName("Prakash s");
		st.setPercentage(76.6);
		st=sd.updateStudent(st);
	}
}
