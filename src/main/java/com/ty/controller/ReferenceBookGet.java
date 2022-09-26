package com.ty.controller;

import com.ty.dao.ReferenceBookDAO;
import com.ty.dto.ReferenceBook;

public class ReferenceBookGet {

	public static void main(String[] args) {
		ReferenceBookDAO rb=new ReferenceBookDAO();
		ReferenceBook sd=new ReferenceBook();
		sd=rb.ReferenceBookDAOGet(1);
		if(sd!=null) {
			System.out.println("roll no is:"+sd.getId());
			System.out.println("name is "+sd.getAuthor());
			System.out.println("Percentage is:"+sd.getName());
			}
			else {
				System.out.println("Enter valid details");
			}	

	}

}
