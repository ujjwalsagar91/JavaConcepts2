package Streams;

import java.util.Arrays;
import java.util.List;

public class CountStringsHavingLengthLessthan3 {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Ujjwal", "", "Sagar", "", "Kumar","a", "b", "c", "d");
		
		long StrCount = strList.stream().filter(e->!e.isEmpty() & e.length()<3).count();
		
		System.out.println(StrCount);
		
	}

}
