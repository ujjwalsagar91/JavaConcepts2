package Random;

public class LargestAndLowest {
	
	public static void findLargest(int[] a, int len) {
		
		int largest=0;
		for(int i=1; i<len; i++) {
			if(a[i]>a[largest]) {
				largest=i;
			}
		}
		System.out.println(a[largest]);
	}
	
	public static void findLowest(int[] a, int len) {
		
		int lowest = 0;
		for(int i=1; i<len; i++) {
			if(a[i]<a[lowest]) {
				lowest=i;
			}
		}
		System.out.println(a[lowest]);
	}

	public static void main(String[] args) {

		int[] a = {1,4,5,7,2,5};
		findLargest(a, 6);
		findLowest(a, 6);

	}

}
