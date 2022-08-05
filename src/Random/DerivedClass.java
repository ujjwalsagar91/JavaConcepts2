package Random;

public class DerivedClass extends BaseClass {
	
	public DerivedClass(String id, String name) {
		super(id, name);
		System.out.println("Hi");
	}
	
	public void display() {
		System.out.println("Display From Child class");
	}
	
	public static void print() {
		System.out.println("Print From Child class");
	}

	public static void main(String[] args) {
		BaseClass bsc = new DerivedClass("123", "abc");
		bsc.display();
		bsc.print();
	}

}
