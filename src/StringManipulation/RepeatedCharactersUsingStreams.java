package StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedCharactersUsingStreams {
		
	public static void main(String[] args) {
		
		String str = "UjjwalllSaaagar";
		char[] chArr = str.toCharArray();
		
		List<Character> list = new ArrayList<>();
		for(char c : chArr) {
			list.add(c);
		}
		
		Set<Character> s = new HashSet<>();
		
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7);
		
//		list.stream().filter(e -> !s.add(e)).forEach(System.out::println);
		
		str.chars().mapToObj(e->(char)e).filter(e->!s.add((char) e)).forEach(System.out::println);
		long a = str.chars().mapToObj(e->(char)e).filter(e->e.equals('j')).count();
		System.out.println(a);
		
	}

}
