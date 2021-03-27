package operators;

public class ConditionalStatament {
	public static void main(String[] args) {
		//	if else
		// 1 - 18 = child
		//  18 - 30 = adult
		//30-40 = uncle
		// 40 = old


		int age = 27;

		if(age <= 18) {
			System.out.println("child");
		}else if(age > 18 && age <= 30){
			System.out.println("adult");
		}else if(age >30 && age <= 40) {
			System.out.println("uncle");
		}else {
			System.out.println("old");
		}

	}
}
