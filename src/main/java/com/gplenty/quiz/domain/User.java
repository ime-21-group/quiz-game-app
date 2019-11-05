package com.gplenty.quiz.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


	@Entity
	public class User {
			
			@Id
			@GeneratedValue
			private int id;
			
			private String username;
			
			private String passwd;
			
			private int type;
			
			public int getId() {
				return id;
			}
			
			public void setId(int id) {
				this.id = id;
			}
			
			public String getuser() {
				return username;
			}
			
			public void setuser(String user) {
				username = user;
			}
			
			public String getpass() {
				return passwd;
			}
			
			public void setpass(String pass) {
				passwd = pass;
			}
			
			public int gettype() {
				return type;
			}
			
			public void settype(int type) {
				this.type = type;
			}
			
			public User(int type, String user, String pass) {
				this.type = type;
				username = user;
				passwd = pass;
			}
			
			
	}
