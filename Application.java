package com.coderscampus.assignment22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Application {

	public static void main(String[] args) {
		Service.readFile();
		Scanner scan = new Scanner(System.in);
	
	
		System.out.println("Enter your email:");
		String email = scan.nextLine();
		System.out.println("Enter your password:");
		String password = scan.nextLine();
		
		if(email.equalsIgnoreCase(Users.getEmail()) && (password.equals(Users.getPassword()))){
			System.out.println("Welcome "+Users.getName());
		}
		else {
			System.out.println("Invalid login.");
		}
	
	
	
	
	
	scan.close();
		
	

	
	}

}
