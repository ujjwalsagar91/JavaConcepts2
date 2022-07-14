package ArraysManipulation;

public class SumOf3NumbersToZero {

	public static void sum(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {

					if(i!=j || i!=k || j!=k) {
						int sum = arr[i]+arr[j]+arr[k];
						if(sum==0) {
							System.out.print(arr[i] + " ");
							System.out.print(arr[j] + " ");
							System.out.println(arr[k]);
						}

					}
				}
			}

		}
	}

	public static void main(String[] args) {

		int[] arr1 = {-1,0,1,2,-1,-4};

		sum(arr1);

	}

}
