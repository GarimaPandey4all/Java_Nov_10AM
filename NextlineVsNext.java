import java.util.Scanner;

public class NextlineVsNext {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name = sc.next();
		//String name = sc.nextLine();
		
		System.out.println(name);	
		
	}

}
