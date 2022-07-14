package ExceptionHandling;

public class MultiCatch {

	public static void main(String[] args) throws Exception {

		try {
			throw new ArithmeticException();
		}
		
		catch(NullPointerException e) {
			e.printStackTrace();
			throw new Exception();
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally block");
		}
	}

}
