package com.ty.controller;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class DeleteUser {

	public static void main(String[] args) {
		
		UserDAO ud=new UserDAO();
		boolean u=ud.deleteUser(1);
		if(u!=false) {
			System.out.println("Deleted");
		}else
		{
			System.out.println("not deleted");
		}
		}

}
