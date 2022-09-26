package com.ty.controller;

import org.jboss.jandex.Main;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class GetUser {

	public static void main(String[] args) {
		User u=new User();
		UserDAO ud=new UserDAO();
		User u1=ud.finduserById(1);
		if(u!=null) {
		System.out.println("Name is:"+u1.getName());
		System.out.println("mail is "+ u1.getEmail());
		System.out.println("Gender is:"+u1.getGender());
		}
		else {
			System.out.println("Enter valid details");
		}

	}

}
