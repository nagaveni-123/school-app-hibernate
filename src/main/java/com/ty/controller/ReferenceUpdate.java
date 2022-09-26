package com.ty.controller;

import com.ty.dao.ReferenceBookDAO;
import com.ty.dto.ReferenceBook;

public class ReferenceUpdate {

	public static void main(String[] args) {
		ReferenceBook rb=new ReferenceBook();
		ReferenceBookDAO rbd=new ReferenceBookDAO();
		
		rb.setId(1);
		rb.setName("Prakash s");
		rb.setAuthor("Ksbhs");
		rb.setSub("Kannada");
	rb=rbd.ReferenceBookDAOupdate(rb);
	}

}


