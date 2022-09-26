package com.ty.controller;

import com.ty.dao.ReferenceBookDAO;
import com.ty.dto.ReferenceBook;

public class SaveReferenceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceBookDAO rbd=new ReferenceBookDAO();
		ReferenceBook rb=new ReferenceBook();
		  rb.setName("Bavani");
		  rb.setAuthor("bavani@mail.com");
		  rb.setSub("Female");
		  
		  
		  ReferenceBook rbs=rbd.saveReferenceBookDAO(rb);

	}

}
