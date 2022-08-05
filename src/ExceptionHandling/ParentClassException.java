package ExceptionHandling;

import java.io.IOException;

public class ParentClassException {

	public void test1() throws IOException {
		
		try {
			int num = 1/0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
	public void test2() throws IOException {
		int num1 = 1/0;
//		throw new IOException();
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

}
