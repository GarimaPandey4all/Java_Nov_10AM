package com.brainmentors.java.filehandling;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(".mp3");
	}
	
}

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path = "E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File\\sample.txt";
		
		File file = new File(path);
		
		if(file.exists())
		{
			File file2 = new File("E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File\\test.txt");
			file.renameTo(file2);
			
			file.delete();
			System.out.println("File Deleted");
		}
		else {
			file.createNewFile();
			System.out.println("File Created");
		}

		
		//path = "E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File\\songs\\mp3\\audio";
		
		//file = new File(path);
		//file.mkdirs();
		//file.mkdir();
		
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		file = new File("E:\\Java\\JavaProgramsNov_Eclipse_10AM\\File\\songs");
		MyFilter filter = new MyFilter();
		//File files[] = file.listFiles(filter);
		
		File files[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".txt"));
	
		System.out.println("No of files: "+files.length);
		
		File files2[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".mp4"));
		
		System.out.println("No of files: "+files2.length);	
		
		
	}

}
