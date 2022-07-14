package Random1;

public class PrimeNumberTest {

	public static boolean isPrimeNumber(int num) {
		boolean flag = true;
		
		if(num==0 || num==1) {
			flag = false;
		}
		else {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					flag = false;
					break;
				}
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {

		boolean flag = isPrimeNumber(1);
		System.out.println(flag);

	}

}
