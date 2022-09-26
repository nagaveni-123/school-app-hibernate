package com.ty.controller;

import com.ty.dao.ReferenceBookDAO;
import com.ty.dao.StudentDOA;

public class ReferenceBookDelete {

	public static void main(String[] args) {
		ReferenceBookDAO ud=new ReferenceBookDAO();
		boolean u=ud.ReferenceBookDAOdelete(1);
		if(u!=false) {
			System.out.println("Deleted");
		}else
		{
			System.out.println("not deleted");
		}
		}

	}


