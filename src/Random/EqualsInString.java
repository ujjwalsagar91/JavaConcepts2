package Random;

public class EqualsInString {

	public static void main(String[] args) {

		String s1 = "Ujjwal";
		String s2 = "Ujjwal";
		String s3 = new String("Ujjwal");
		String s4 = new String("Ujjwal");
		String s5 = "Sagar";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println("Test "+ s3==s4);
		System.out.println("Test "+s3.equals(s4));
		
		String s11 = String.valueOf(1);
		System.out.println(s11);
		System.out.println(s11+"Hi");
		
		int abc1 = Integer.parseInt("1");
		System.out.println(abc1);
		
	}

}
