package com.gplenty.quiz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


	@Entity
	public class Quiz {
			
			@Id
			@GeneratedValue
			private int quiz_id;
			
			private String author;
			
			private String quiz_name;
			
			private String subject;
			
			private String subject_matter;
			
			public int getId() {
				return quiz_id;
			}
			
			public void setId(int id) {
				quiz_id = id;
			}
			
			public String getauthor() {
				return author;
			}
			
			public void setauthor(String author_name) {
				author = author_name;
			}
			
			public String getname() {
				return quiz_name;
			}
			
			public void setname(String name) {
				quiz_name = name;
			}
			
			public String getsubj() {
				return subject;
			}
			
			public void setsubj(String subj) {
				subject = subj;
			}
			
			public String getmatter() {
				return subject_matter;
			}
			
			public void setmatter(String matter) {
				subject_matter = matter;
			}
			
			public Quiz(int id, String ath, String name, String subj, String matter) {
				quiz_id = id;
				author = ath;
				quiz_name = name;
				subject = subj;
				subject_matter = matter;
			}
			
			public static void main (String[] args) {
				
			}
	}
