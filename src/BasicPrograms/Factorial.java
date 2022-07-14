package BasicPrograms;

public class Factorial {

	public static int findFactorialWithoutRecurssion(int num1) {

		int fact = 1;

		for(int i=1; i<=num1; i++) {
			fact = fact*i;
		}

		return fact;
	}

	public static int findFactorialWithRecurssion(int num1) {

		if(num1==0 || num1==1) {
			return 1;
		}

		else {
			return num1 * findFactorialWithRecurssion(num1-1);
		}

	}

	public static void main(String[] args) {

		System.out.println(findFactorialWithoutRecurssion(5));
		System.out.println(findFactorialWithRecurssion(5));

	}
}
