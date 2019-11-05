package com.gplenty.quiz.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.gplenty.quiz.domain.users.Teacher;


@Entity
public class Quiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int quiz_id;
	
	@ManyToOne
	@JoinColumn(name="author")
	private Teacher author;
	
	@Column(name="quiz_name")
	private String quizName;
	
	private String subject;
	
	private String subject_matter;

	//
	// Métodos de acesso
	//
	public int getQuiz_id() {
		return quiz_id;
	}

	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}

	public Teacher getAuthor() {
		return author;
	}

	public void setAuthor(Teacher author) {
		this.author = author;
	}

	public String getQuizName() {
		return quizName;
	}

	public void setQuizName(String quiz_name) {
		this.quizName = quiz_name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject_matter() {
		return subject_matter;
	}

	public void setSubject_matter(String subject_matter) {
		this.subject_matter = subject_matter;
	}

	
}
