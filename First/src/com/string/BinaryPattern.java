package com.string;

public class BinaryPattern {
	
	public static void main(String[] args) {
		for(int i = 0;i<=5;i++) {
			if(i%2==0) {
				for(int j=0;j<=i;j++) {
					System.out.print(j%2+" ");
				}
				System.out.println();
			}else {
				for(int j=0;j<=i;j++) {
					System.out.print((j+1)%2+" ");
				}
				System.out.println();
			}
			
		}
	}

}
