package com.gplenty.quiz;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Question {
		
		@Id
		@GeneratedValue
		private int question_id;
		
		private int quiz_id;
		
		private String header;
		
		private String correct_answer;
		
		public int getId() {
			return question_id;
		}
		
		public void setId(int id) {
			question_id = id;
		}
		
		public int getQuizId() {
			return quiz_id;
		}
		
		public void setQuizId(int id) {
			quiz_id = id;
		}
		
		public String getheader() {
			return header;
		}
		
		public void setheader(String hd) {
			header = hd;
		}
		
		public String getans() {
			return correct_answer;
		}
		
		public void setans(String ans) {
			correct_answer = ans;
		}
		
		public Question(int id, int quizID, String hd, String ans) {
			question_id = id;
			quiz_id = quizID;
			header = hd;
			correct_answer = ans;
		}
		
		public static void main (String[] args) {
			
						
		}
}
