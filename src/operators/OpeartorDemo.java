package operators;

public class OpeartorDemo {
	public static void main(String[] args) {
		
		// comparison operator
		// ==, !=, >= , <= ,> , <
		
		// return is always boolean true/false
		
		boolean b1 = 10 == 11;
//		System.out.println(b1);
		
		
		// bitwise and logical operator
		// And - &  , &&
		// Or - | ,   ||
		// return true/false - boolean
		// input data is boolean 
		
		boolean m1 = 10 == 10; // true
		boolean m2 = 20 == 21; // false

		// And condition (When both condition is true then it will true)
		// T & T = T 
		// T & F = F
		// F & T = F
		// F & F = F
		
		boolean m3 = m1 & m2;
		System.out.println(m3);

		// Or condition (when any condition is true result is true)
		// T || T = T  
		// T | F = T
		// F | T = T
		// F | F = F

		boolean m4 = false || false;
		System.out.println(m4);
		
		String s1 = "sathya";
		String s2 = "sathya";
		
		boolean m5 = s1.equals(s2);
		System.out.println(m5);
		
		// assignment operators
		
	}
}
