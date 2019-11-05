package com.gplenty.quiz.domain.users;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.gplenty.quiz.domain.Quiz;
import com.gplenty.quiz.domain.User;
import com.gplenty.quiz.domain.UserType;

@DiscriminatorValue("0")
@Entity
public class Teacher extends User
{
	//
	// Atributos
	//
	@OneToMany(mappedBy="author")
	private List<Quiz> quizes;
	
	
	//
	// Métodos de acesso
	//
	@Override
	public UserType getType() {
		return UserType.Teacher;
	}

	public List<Quiz> getQuizes() {
		return quizes;
	}

	public void setQuizes(List<Quiz> quizes) {
		this.quizes = quizes;
	}
}
