package Random;

public class SwapNumbers {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;
		
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println(a + " " + b);

	}

}
