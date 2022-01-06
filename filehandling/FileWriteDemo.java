package com.brainmentors.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the Data to Write in a File");
		Scanner sc = new Scanner(System.in);
		
		String txt = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File\\sample.txt");
		
		fo.write(txt.getBytes());
		
		fo.close();
		
		
		System.out.println("Program Terminated");
		
	}

}
