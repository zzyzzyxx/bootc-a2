package com.coderscampus.assignment22;
// POJO
public class Users {
		
		 private static String email;
		 private static String password;
		 private static String name;
		
		 //constructor
		 
		 	Users (String[] array) {
			this.email = array[0];
			this.password = array[1];
			this.name = array[2];
		}	
		//getters and setters
		public static String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public static String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public static String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}