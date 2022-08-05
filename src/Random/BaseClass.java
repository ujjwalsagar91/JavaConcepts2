package Random;

public class BaseClass {
	
	String id;
	String name;
	
//	public BaseClass() {
//		
//	}
	
	public BaseClass(String id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Display From Base class");
	}
	
	public static void print() {
		System.out.println("Print From Base class");
	}


}
