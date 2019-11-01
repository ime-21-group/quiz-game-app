package com.gplenty.quiz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Teacher {
		
		@Id
		@GeneratedValue
		private int teacher_id;
		
		private String username;
		
		private String Tpassword;
		
		public int getId() {
			return teacher_id;
		}
		
		public void setId(int id) {
			teacher_id = id;
		}
		
		public String getuser() {
			return username;
		}
		
		public void setuser(String user) {
			username = user;
		}
		
		public String getpass() {
			return Tpassword;
		}
		
		public void setpass(String pass) {
			Tpassword = pass;
		}
		
		public Teacher(int id, String user, String pass) {
			teacher_id = id;
			username = user;
			Tpassword = pass;
		}
		
		public static void main (String[] args) {
			
						
		}
}
