package Random;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void reverseWithNewArray(int[] a) {
		
		int[] b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[a.length-i-1] = a[i];
		}
		
		System.out.println(Arrays.toString(b));
	}
	
	public static void reverseUsingSwap (int[] a) {
		
		int temp;
		for(int i=0; i<a.length/2; i++) {
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		}
		
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7};
		reverseWithNewArray(a);
		reverseUsingSwap(a);

	}

}
