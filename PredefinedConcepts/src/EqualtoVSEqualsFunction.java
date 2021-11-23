
public class EqualtoVSEqualsFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String name = "Ram"; // literals / constant
		
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.println(s1 == s2); // false: reference comparison (address comparison)
		System.out.println(s1.equals(s2)); // true: content comparison
		
	}
}
