package com.coderscampus.assignment22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Service {

	public static void readFile() {
		BufferedReader reader = null;	

		try {
			reader = new BufferedReader(new FileReader("data.txt"));
			
			String line;
			while((line = reader.readLine())!= null) {
					Scanner scan = new Scanner(line);
					
					String[] array = line.split(",");
				       for(int i=0;i<array.length;i++)
				       {
				           System.out.println(array[i]);
				       }			
			//System.out.println(line); // prints one ENTIRE line
			}
			//System.out.println(linesSeparated[1]); CAN'T DO THAT!
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} catch  (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("Closing the reader");
				reader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}

	public static void createUser() {
		Users user = new Users(array);
	}
	

}
