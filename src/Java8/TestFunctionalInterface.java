package Java8;

@FunctionalInterface
public interface TestFunctionalInterface {
	
	public abstract void display();
	
	default void print() {
		System.out.println("Print method of Functional Interface");
	}
	
	static void show() {
		System.out.println("Show method of Functional Interface");
	}
	

}
