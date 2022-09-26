package com.ty.controller;

import com.ty.dao.StudentDOA;
public class StudentDelete {

	public static void main(String[] args) {
		StudentDOA ud=new StudentDOA();
		boolean u=ud.DeleteStudent(1);
		if(u!=false) {
			System.out.println("Deleted");
		}else
		{
			System.out.println("not deleted");
		}
		}

	}

