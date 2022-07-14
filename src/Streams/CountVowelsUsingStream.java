package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountVowelsUsingStream {

	public static void main(String[] args) {

		String str = "UjjwalKumarSagar";
		
		List<String> list = Arrays.asList(str.split(""));
		
		long count = list.stream().map(e->e.toLowerCase()).filter(e->e.equals("a") || e.equals("e")).count();
		
		System.out.println(count);
		
		

	}

}
