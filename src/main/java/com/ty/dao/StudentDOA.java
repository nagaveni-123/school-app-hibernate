package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Student;
import com.ty.dto.User;

public class StudentDOA {
	public Student saveStudent(Student s) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(s);
		et.commit();
		return s;
		
	}
	public Student updateStudent(Student s) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(s);
		et.commit();
		
		return null;
		
	}
	public Student getStudent(int id) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=entityManagerFactory.createEntityManager();
		Student s=em.find(Student.class, id);
		
		return s;
		
	}
	public boolean DeleteStudent(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Student s=em.find(Student.class, 5);
		if(s!=null) {
			et.begin();
			em.remove(s);
			et.commit();
		}
		return true;
		
	}

}

