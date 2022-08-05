package ExceptionHandling;

import java.io.IOException;

public class ChildClassException extends ParentClassException {
	
	public void test1() {
		System.out.println("In child class");
	}
	
	public void test2() {
		System.out.println("In child class");
	}
	
	
	public static void main(String[] args) throws IOException {
		
		ParentClassException p = new ChildClassException();
		try {
			p.test1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.test2();
		
	}

}
