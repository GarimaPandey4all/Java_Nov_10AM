import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderConcept {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner sc = new Scanner(System.in);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your age:");
		int age = Integer.parseInt(bf.readLine());
		
		System.out.println("Enter your name:");
		String name = bf.readLine();
		
		System.out.println(age +" "+name);
		
		
	}

}
