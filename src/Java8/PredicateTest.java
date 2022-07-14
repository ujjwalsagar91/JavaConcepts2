package Java8;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {

		Predicate<String> checkLen = (s) -> s.length()>=5;
		System.out.println("Length of the string is greater than 5 " + checkLen.test("UjjwalSagar"));

	}

}
