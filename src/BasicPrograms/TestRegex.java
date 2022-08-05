package BasicPrograms;

import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {

		System.out.println(Pattern.matches("[amn]?", "amn"));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9\\$\\s]{7}", "a r$un2"));

	}

}
