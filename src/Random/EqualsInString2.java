package Random;

import java.util.Scanner;

public class EqualsInString2 {

	public static void main(String[] args) {

		String s1 = "Ujjwal";
		String s2 = "Ujjwal";
		String s3 = new String("Ujjwal");
		String s4 = new String("Ujjwal");
		StringBuffer s5 = new StringBuffer("Ujjwal");
		StringBuilder s6 = new StringBuilder("Ujjwal");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
//		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
//		System.out.println(s1==s6);
		System.out.println(s1.equals(s6));
//		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		char[] ch = {'u','j','j','w','a','l'};
		String abc = new String(ch);
		System.out.println(abc);
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	    int age = myObj.nextInt();
	    double salary = myObj.nextDouble();

	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);
		
		
	}

}
