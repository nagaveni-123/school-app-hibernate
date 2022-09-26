package com.ty.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.ReferenceBook;

public class ReferenceBookDAO {



	
		public ReferenceBook saveReferenceBookDAO(ReferenceBook book) {
			
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.persist(book);
			entityTransaction.commit();
			return book;
			
		}
		public ReferenceBook ReferenceBookDAOGet(int id) {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager em=entityManagerFactory.createEntityManager();
			ReferenceBook rs=em.find(ReferenceBook.class, id);
		

			return rs;
			
		}
		public boolean ReferenceBookDAOdelete(int id) {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
			EntityManager em=entityManagerFactory.createEntityManager();
			EntityTransaction et=em.getTransaction();
			//Student s=em.find(Student.class, 5);
			return true;
			
		}
		public ReferenceBook ReferenceBookDAOupdate(ReferenceBook book) {
			EntityManagerFactory emf=Persistence.createEntityManagerFactory("vikas");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.merge(book);
			et.commit();
			
			return book;
			
		}

	}



