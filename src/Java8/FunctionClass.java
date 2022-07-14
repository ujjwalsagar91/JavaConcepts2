package Java8;

import java.util.function.Function;

public class FunctionClass {

	public static void main(String[] args) {


		Function<Integer, Double> func = (s) -> Double.valueOf(s*s);
		
		System.out.println(func.apply(5));

	}

}
