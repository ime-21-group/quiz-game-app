package com.gplenty.quiz;

import java.util.List;

import com.gplenty.quiz.daos.UserDao;
import com.gplenty.quiz.domain.User;
import com.gplenty.quiz.domain.UserType;

public class QuizApplication {

	public static void main(String[] args) {
		UserDao ud = new UserDao();
		
		List<User> users = ud.retrieveAll();
		
		System.out.println("Teachers");
		for (User user : users) {
			if(user.getType() == UserType.Teacher)
				System.out.println(user.getUsername());
		}
		System.out.println("");
		System.out.println("Students:");
		
		for (User user : users) {
			if(user.getType() == UserType.Student)
				System.out.println(user.getUsername());
		}
	
	}

}
