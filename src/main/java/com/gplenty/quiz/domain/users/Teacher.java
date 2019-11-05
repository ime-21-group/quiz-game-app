package com.gplenty.quiz.domain.users;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.gplenty.quiz.domain.User;
import com.gplenty.quiz.domain.UserType;

@DiscriminatorValue("0")
@Entity
public class Teacher extends User
{

	
	
	//
	// Métodos de acess
	//
	@Override
	public UserType getType() {
		return UserType.Teacher;
	}
	
}
