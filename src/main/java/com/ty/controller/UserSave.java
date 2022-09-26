package com.ty.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class UserSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  User u=new User();
		  u.setName("Bavani");
		  u.setEmail("bavani@mail.com");
		  u.setGender("Female");
		  u.setPassword("123h1");
		  u.setPhone(98756433l);
		  UserDAO ud=new UserDAO();
		  ud.saveUser(u);
		 
		
		
		
	}

}
