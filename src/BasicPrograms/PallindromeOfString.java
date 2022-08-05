package BasicPrograms;

import java.util.ArrayList;
import java.util.List;

public class PallindromeOfString {

	public static void main(String[] args) {

		//		findpallindrome("ababbbabbababa");
		findsubstring("ababbbabbababa");

	}

//	public static void findpallindrome(String s) {
//
//		int index=0;
//		List<String> list = new ArrayList<>();
//		for(int i=0; i<s.length(); i++) {
//			String s1 = s.substring(0,i) + s.substring(i+1, i+1+index);
//			String rev = reverseString(s1);
//			if(s1==rev) {
//				list.add(s1);
//				index++;
//			}
//		}
//
//		for(String s5 : list) {
//			System.out.println(s5);
//		}
//	}
//
//	public static String reverseString(String s2) {
//
//		String op="";
//
//		char[] ch = s2.toCharArray();
//		for(int k=ch.length-1; k>0; k--) {
//			op = op + String.valueOf(ch[k]);
//		}
//		return op;
//
//	}

	public static void findsubstring (String s) {

		List<String> list = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			for(int j=0; j<s.length()-1; j++) {
				String s1 = s.substring(i,i+j) + s.substring(j, j+1);
				list.add(s1);
			}
		}
		
		for(String a : list) {
			System.out.println(a);
		}
	}

}
