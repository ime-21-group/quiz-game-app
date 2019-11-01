package com.gplenty.quiz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


	@Entity
	public class Student {
			
			@Id
			@GeneratedValue
			private int student_id;
			
			private String username;
			
			private String Spassword;
			
			public int getId() {
				return student_id;
			}
			
			public void setId(int id) {
				student_id = id;
			}
			
			public String getuser() {
				return username;
			}
			
			public void setuser(String user) {
				username = user;
			}
			
			public String getpass() {
				return Spassword;
			}
			
			public void setpass(String pass) {
				Spassword = pass;
			}
			
			public Student(int id, String user, String pass) {
				student_id = id;
				username = user;
				Spassword = pass;
			}
			
			public static void main (String[] args) {
				
			}
	}
