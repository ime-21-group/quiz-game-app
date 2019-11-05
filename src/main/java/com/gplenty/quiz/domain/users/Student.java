package com.gplenty.quiz.domain.users;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.gplenty.quiz.domain.User;
import com.gplenty.quiz.domain.UserType;

@DiscriminatorValue("1")
@Entity
public class Student extends User
{

	@Override
	public UserType getType() {
		return UserType.Student;
	}

}
