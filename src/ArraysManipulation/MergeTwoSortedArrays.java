package ArraysManipulation;

import java.util.Iterator;

public class MergeTwoSortedArrays {

	public static void mergeSortedArrays(int a1[], int a2[]) {

		int i = 0;
		int j = 0;
		int k=0;
		int a3[] = new int[a1.length+a2.length];

		while(i<a1.length&&j<a2.length) {
			if(a1[i]<a2[j]) {
				a3[k++]=a1[i++];
			}
			else {
				a3[k++] = a2[j++];
			}
		}

		while(i<a1.length) {
			a3[k++] = a1[i++];
		}

		while(j<a2.length) {
			a3[k++] = a2[j++];
		}
		
		for(int l=0; l<a3.length; l++) {
			System.out.println(a3[l]);
		}
	}

	public static void main(String[] args) {
		
		int a1[] = {1, 4, 9};
		int a2[] = {2,5,8,12};
		mergeSortedArrays(a1, a2);
	}
}
