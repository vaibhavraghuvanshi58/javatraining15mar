package operators;

public class AssignmentOperator {
	public static void main(String[] args) {
//		int i = 10;
//		
//		i =  i + 5;
//		i%=5;  // i = i %5;
		
		// Increments and decrements , adding and subtracting
		
//		int k = 10;
//		k++;  // k=k+1;  k+=1;
//		System.out.println(k);
		// preincrement, postincrement
		
		// Preincrement - first increase then assign
		// postincrement = first assign then increase
		
		int y = 10;
		int m =  y++ + y++;
		//       10 + 11
		
		System.out.println(m); // 
		System.out.println(y); // 12
		
		
	}
}
