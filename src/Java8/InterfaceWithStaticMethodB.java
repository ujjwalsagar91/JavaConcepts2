package Java8;

public interface InterfaceWithStaticMethodB {
	
	static void staticTest1() {
		System.out.println("Static method of Interface B");
	}
	
	default void defaultTest1() {
		System.out.println("Default method  of Interface B");
	}

}
