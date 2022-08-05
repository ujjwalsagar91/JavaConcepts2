package BasicPrograms;

public class PrimeNumber {

	public static void checkPrimeNumber(int num) {

		boolean flag = true;

		if(num == 0 || num == 1) {
			System.out.println(num + " is not a prime number.");
		}
		else {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					flag = false;
					break;
				}
			}

			if(flag) {
				System.out.println(num + " is a prime number.");
			}
			else {
				System.out.println(num + " is not a prime number.");
			}
		}
	}
	
	public static void checkPrimeNumberBetweenNumbers(int a, int b) {
		
		for(int i=a; i<=b; i++) {
			checkPrimeNumber(i);
		}
		
	}

	public static void main(String[] args) {

		checkPrimeNumber(2);
		checkPrimeNumberBetweenNumbers(1,100);

	}

}
