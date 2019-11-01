package com.gplenty.quiz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


	@Entity
	public class Answered_Quiz {
			
			@Id
			@GeneratedValue
			private int answeredQuiz_id;
			
			private int quiz_id;
			
			private int student_id;
			
			private float grade;
			
			public int getId() {
				return answeredQuiz_id;
			}
			
			public void setId(int id) {
				answeredQuiz_id = id;
			}
			
			public int getQuizId() {
				return quiz_id;
			}
			
			public void setQuizId(int id) {
				quiz_id = id;
			}
			
			public int getStudentId() {
				return student_id;
			}
			
			public void setStudentId(int id) {
				student_id = id;
			}
			
			public float getgrade() {
				return grade;
			}
			
			public void setgrade(float g) {
				grade = g;
			}
			
			public Answered_Quiz(int id, int quizID, int sid, float g) {
				answeredQuiz_id = id;
				quiz_id = quizID;
				student_id = sid;
				grade = g;
			}
			
			public static void main (String[] args) {
				
			}
	}
