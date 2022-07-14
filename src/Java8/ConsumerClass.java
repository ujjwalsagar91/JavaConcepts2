package Java8;

import java.util.function.Consumer;

public class ConsumerClass {

	public static void main(String[] args) {

		Consumer<Integer> cons = (s) -> System.out.println("I'm printing the square of the number " + s + ": " + s*s);
		cons.accept(5);
	}

}
