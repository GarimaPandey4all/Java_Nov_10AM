package com.brainmentors.java.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String sourcePath = "E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File\\songs\\shapeofyou.mp3";
		String desPath = "E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File\\songs\\shapeofyouCopy.mp3";
		
		File file = new File(sourcePath);
		
		if(!file.exists())
		{
			System.out.println("Can't Copy File not exist");
			return;
		}
		
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs);
		FileOutputStream fo = new FileOutputStream(desPath);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("Copy Start");
		
		int singleByte = bs.read();
		final int EOF = -1;
		
		while(singleByte != EOF)
		{
			bo.write(singleByte);
			singleByte = bs.read();
		}
		
		bo.close();
		bs.close();
		fo.close();
		fs.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Data Copied "+(endTime - startTime)+"ms");

	}

}
 