package Java8;
import java.util.function.Supplier;

public class SupplierClass {

	public static void main(String[] args) {

		Supplier<String> supp = () -> new String("Supplier test");
		System.out.println(supp.get());

	}

}
