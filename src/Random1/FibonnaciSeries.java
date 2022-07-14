package Random1;

import java.util.ArrayList;
import java.util.List;

public class FibonnaciSeries {
	
	public static List<Integer> printFibonacci(int num) {
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		List<Integer> list = new ArrayList<>();
		System.out.println(n1);
		System.out.println(n2);
		list.add(n1);
		list.add(n2);
		for(int i=0; i<num-2; i++) {
			n3 = n1+n2;
			list.add(n3);
			
			System.out.println(n3);
			
			n1=n2;
			n2=n3;
		}
		
		return list;
		
	}

	public static void main(String[] args) {

		List list = printFibonacci(9);
		System.out.println(list.get(8));

	}

}
