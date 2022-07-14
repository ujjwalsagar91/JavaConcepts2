package Java8;

public class MethodReferenceTest {

	public static void main(String[] args) {

		TestFunctionalInterface tfi = MethodImplementationClass :: testImplementation1;
		tfi.display();
	}
}
