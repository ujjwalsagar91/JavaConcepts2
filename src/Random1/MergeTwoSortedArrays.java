package Random1;

public class MergeTwoSortedArrays {

	public static void megreSortedArray(int[] a, int[] b) {

		int[] c = new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;

		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}

		while(i<a.length) {
			c[k++] = a[i++];
		}

		while(j<b.length) {
			c[k++] = b[j++];
		}

		for(int ele : c) {
			System.out.println(ele);
		}
	}

	public static void main(String[] args) {

		int[] a = {0,1,4,8};
		int[] b = {2,3,5,9};

		megreSortedArray(a,b);

	}

}
