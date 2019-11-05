package com.gplenty.quiz.domain.users;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.gplenty.quiz.domain.AnsweredQuiz;
import com.gplenty.quiz.domain.User;
import com.gplenty.quiz.domain.UserType;

@DiscriminatorValue("1")
@Entity
public class Student extends User
{
	//
	// Atributos
	//
	@OneToMany(mappedBy="student")
	private List<AnsweredQuiz> answeredQuizes;
	
	//
	// Métodos de acesso
	//
	@Override
	public UserType getType() {
		return UserType.Student;
	}

}
