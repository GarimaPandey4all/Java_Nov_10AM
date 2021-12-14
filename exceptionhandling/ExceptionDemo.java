package com.brainmentors.java.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		//Exception: Abnormal Condition or Runtime Error
		//Abnormal Condition which terminates the program flow
		
		System.out.println("DB Connection Open");
		System.out.println("DB Query");
		//guarded region
		try
		{
			String path = "E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File123\\sample.txt";
			
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
				System.out.println("File Created...");
			}
			
			/*
			String name = null;
			
			name.toUpperCase(); // throw NullPointerException
			
			int arr[] = new int[10];
			arr[11] = 100; // throw ArrayIndexOutOfBoundsException
			
			int e = 10 / 0; // throw ArithmeticException
			*/
		}
		catch(IOException e)
		{
			System.out.println("File can't be created");
			return;
		}
		catch(NullPointerException e)
		{
			System.out.println("Value is Null");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Size of the Array is out of bound (size)");
			return;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide a number by zero "+e);
			//return;
			System.exit(0); // exit the program
		}
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("DB Connection Close");
		
	}

}
