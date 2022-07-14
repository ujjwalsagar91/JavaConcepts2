package Java8.defaultMethodsInInterface;

public class DefaultMethodTest implements DefaultMethodTestInterface1, DefaultMethodTestInterface2 {

	public static void main(String[] args) {

		DefaultMethodTestInterface1 st = new DefaultMethodTest();
		st.demo1();

	}

	@Override
	public void demo1() {
		DefaultMethodTestInterface2.super.demo1();
	}

}
