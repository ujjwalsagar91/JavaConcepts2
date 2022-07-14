package BasicPrograms;

public class ReverseNumber {

	static void reverseGivenNumber(int num) {
		
		int rev = 0;
		
		while(num>0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {

		reverseGivenNumber(12547658);

	}

}
