package com.gplenty.quiz.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

import com.gplenty.quiz.daos.UserDao;

public class teste {

	public static void main (String[] args) {
	UserDao ud = new UserDao();
		
	List<User> users = ud.retrieveByUsarnameAndPassword("Gabriel", "borginhosS2");
	
	for(User user : users) {
		System.out.println(user.getId() +"  "+ user.getUsername() +"  "+ user.getPasswd() +"  "+ user.getType());
	}
	

}
		
}
