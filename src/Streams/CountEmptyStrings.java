package Streams;

import java.util.Arrays;
import java.util.List;

public class CountEmptyStrings {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Ujjwal", "", "Sagar", "", "Kumar");
		
		long emptyStrCount = strList.stream().filter(e->e.isEmpty()).count();
		
		System.out.println(emptyStrCount);
		
	}

}
