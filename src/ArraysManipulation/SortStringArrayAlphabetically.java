package ArraysManipulation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringArrayAlphabetically {
	
	public static void sortArrayUsingStreams(String[] a) {
		
		List<String> st = Stream.of(a).sorted().collect(Collectors.toList());
		System.out.println(st);
		
	}
	
	public static void sortArrayForLoop(String[] a) {
		
		for(int i=0; i< a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i].compareTo(a[j])>0) {
					String temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(String abc : a) {
			System.out.println(abc);
		}
		
	}
	public static void main(String[] args) {

		String[] a = {"Abcde","Abcd","Pqf", "Abd"};
		sortArrayUsingStreams(a);
		sortArrayForLoop(a);

	}

}
