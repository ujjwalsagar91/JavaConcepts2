package Random;

public class abstractClassRunner extends abstractClassTest{

	public static void main(String[] args) {
		
		abstractClassTest abs = new abstractClassRunner();
		abs.test();
		abs.print();

	}

	@Override
	void test() {

		System.out.println("test implemented in Runner class");
		
	}

}
