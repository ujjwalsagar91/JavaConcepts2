package BasicPrograms;

public class ArmstrongNumber {

	public static void checkArmstrong(int num) {
		
		int temp = num;
		int temp2 = num;
		
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Digits in number is " + count);
		
		double sum=0;
		
		while(temp>0) {
			int n1 = temp%10;
			sum = sum + Math.pow(n1, count);
			temp = temp/10;
		}
		
		System.out.println("Sum of all digits raised to power " + count + " is " + (int)sum);
		
		int finalSum = (int)sum;
		if(finalSum==temp2)
			System.out.println("It is armstrong number");
		
	}
	
	
	public static void main(String[] args) {

		checkArmstrong(153);

	}

}
