package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEmptyStrings {

	public static void main(String[] args) {

		List<String> strList = Arrays.asList("Ujjwal", "", "Sagar", "", "Kumar");
		
		List<String> list1 = Arrays.asList("Ujjwal|SSE1|123456","Sagar|SSE2|234567","Ujjwal|SSE3|765544","Abc|SSE4|236232");
		
		long emptyStrCount = strList.stream().filter(e->e.isEmpty()).count();
		
		long emptyStrCount1 = strList.stream().filter(e->e.length()<1).count();
		List<String[]> empUj = list1.stream().map(e->e.split("|")).filter(e->e.equals("Ujjwal")).collect(Collectors.toList());
		
		System.out.println(emptyStrCount);
		System.out.println(emptyStrCount1);
		System.out.println(empUj);
	}

}
