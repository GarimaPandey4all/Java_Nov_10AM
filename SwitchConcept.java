import java.util.Scanner;

public class SwitchConcept {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		String choice = sc.nextLine();
		
		switch(choice)
		{
		case "one":
			System.out.println("One");
			break;
			
		case "two":
			System.out.println("Two");
			break;
			
		case "three":
			System.out.println("Three");
			break;
			
		case "four":
			System.out.println("Four");
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		
	}

}
