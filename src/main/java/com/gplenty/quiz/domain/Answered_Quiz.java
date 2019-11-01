package com.gplenty.quiz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Answered_Quiz {
		
	//
	// Atributos
	//

	@Id
	@GeneratedValue
	@Column(name="answeredQuiz_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="quiz_id")
	private Quiz quiz;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	
	private Float grade;

	//
	// Métodos
	//
	public Answered_Quiz(Quiz quiz, Student student, Float grade) {
		this.quiz = quiz;
		this.student = student;
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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Float getGrade() {
		return grade;
	}

	public void setGrade(Float grade) {
		this.grade = grade;
	}
	
}
