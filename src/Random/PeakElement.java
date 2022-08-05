package Random;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {

	public static void findPeakElement(int[] a, int len) {

		int largest=0;

		for(int i=1; i<len; i++) {
			if(a[i]>a[largest]) {
				largest=i;
			}
		}
		System.out.println(largest);
	}

	public static void main(String[] args) {

		int[] a = {5,3,4,6};
		findPeakElement(a, 4);

	}

}
