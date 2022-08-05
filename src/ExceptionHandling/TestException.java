package ExceptionHandling;

public class TestException {

	public static void main(String[] args) throws Exception {

		boolean a = true;
		
		try {
			if(a) {
				throw new NullPointerException();
			}
		}
		catch(Exception e) {
			System.out.println("Exception");
			throw e;
		}
		finally {
			System.out.println("Finally");
		}
	}

}
