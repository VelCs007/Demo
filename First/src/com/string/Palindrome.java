package com.string;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string:");
		String s1 = scanner.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s1.toLowerCase().equals(s2.toLowerCase())) {
			System.out.println(s1+" is a palindrome");
		}else {
			System.out.println(s1+" is not a palindrome");
		}
	}

}
