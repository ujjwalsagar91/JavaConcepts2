package BasicPrograms;

public class FibonacciSeries {

	public static void findFibonacciSeries(int num) {

		int n1 = 0;
		int n2 = 1;
		int n3;

		System.out.println(n1);
		System.out.println(n2);

		for(int i=2; i<=num; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	

	public static void main(String[] args) {

		findFibonacciSeries(7);
	}
}
