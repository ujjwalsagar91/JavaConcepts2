package MethodHiding;

public class ChildClass extends ParentClass {
	
	public static void demo1() {
		System.out.println("This is static demo1 method of Child class");
	}
	
	public void demo2() {
		System.out.println("This is non static demo2 method of Child class");
	}
	
	public static void main(String[] args) {
		ParentClass p1 = new ChildClass();
		p1.demo1();
		p1.demo2();
		
		ChildClass c1 = new ChildClass();
		c1.demo1();
		c1.demo2();
		
		ParentClass p2 = new ParentClass();
		p2.demo1();
		p2.demo2();
		
	}

}
