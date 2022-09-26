package com.ty.controller;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class UpdateUser {

	public static void main(String[] args) {
		User user=new User();
		UserDAO ud=new UserDAO();
		user.setId(1);
		user.setName("Prakash s");
		user.setEmail("Shetti@gmail.com");
		User u=ud.updateUser(user);

	}

}
