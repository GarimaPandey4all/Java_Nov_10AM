
public class EqualsVsEqualIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello";
		String s2 = "Hello";
		
		
		if(s1.equals(s2)) {
			System.out.println("String s1 equals to s2");
		}
		else {
			System.out.println("String s1 is not equals to s2");
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String s1 equals to s2");
		}
		else {
			System.out.println("String s1 is not equals to s2");
		}

	}

}
