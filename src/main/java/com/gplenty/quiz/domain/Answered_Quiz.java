package com.gplenty.quiz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Answered_Quiz {
		
	//
	// Atributos
	//

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="answered_quiz_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="quiz_id")
	private Quiz quiz;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private User user;
	
	private Float grade;

	//
	// Métodos
	//
	public Answered_Quiz(Quiz quiz, User user, Float grade) {
		this.quiz = quiz;
		this.user = user;
		this.grade = grade;
	}

	//
	// Métodos de acesso
	//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public User getStudent() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Float getGrade() {
		return grade;
	}

	public void setGrade(Float grade) {
		this.grade = grade;
	}
	
}
