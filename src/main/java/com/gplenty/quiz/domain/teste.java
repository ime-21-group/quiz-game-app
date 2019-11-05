package com.gplenty.quiz.domain;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

public class teste {

	public static void main (String[] args) {
		User user = new User(0, "Gabriel", "123456");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("User");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();        
	    manager.persist(user);
	    manager.getTransaction().commit(); 
		
	    System.out.println("ID do user: " + user.getId());
	    
	    manager.close();
		
	}
	
}
