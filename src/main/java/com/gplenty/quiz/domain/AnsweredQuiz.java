package com.gplenty.quiz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gplenty.quiz.domain.users.Student;


@Entity
@Table(name="Answered_Quiz")
public class AnsweredQuiz {
		
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
	private Student student;
	
	private Float grade;

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

	public void setStudent(Student user) {
		this.student = user;
	}

	public Float getGrade() {
		return grade;
	}

	public void setGrade(Float grade) {
		this.grade = grade;
	}
	
}
