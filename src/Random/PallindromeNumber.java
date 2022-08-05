package Random;

public class PallindromeNumber {
	
	public static void checkPallindrome(int num) {
		
		int rev = 0;
		int temp = 0;
		int rev1 = num;
		while(num>0) {
			temp = num%10;
			rev = rev*10+temp;
			num = num/10;
		}
		
		if(rev==rev1) {
			System.out.println(rev + " is pallindrome");
		}
		
		else {
			System.out.println(rev + " is not pallindrome");
		}
		
	}

	public static void main(String[] args) {

		checkPallindrome(489841);

	}

}
