package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String args[]) {
		boolean a = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string:");
		String s2 = sc.nextLine();
		if (s1.length() == s2.length()) {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			String s3 = "";
			String s4 = "";
			for (int i = 0; i < c1.length; i++) {
				s3 = s3 + c1[i];
				s4 = s4 + c2[i];
			}
			if (s3.equals(s4)) {
				System.out.println("True");
			} else {
				System.out.println("False");
			}
		} else {
			System.out.println("False");
		}
	}

}
