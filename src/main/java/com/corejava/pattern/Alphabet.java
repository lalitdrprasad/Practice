package com.corejava.pattern;

import java.util.Random;

public class Alphabet {

	static void print(int n) {
		int rows = n;
		System.out.println("Rows = " + rows);
		char c = 'A';
		for (int i = 0; i < rows; i++) {
			System.out.printf("Row - %2d : ", i);
			for (int j = 0; j <=i; j++) {
				System.out.printf("%4c",c++);
			}
			
			System.out.println("\n");
			c = 'A';
		}
	}
	
	public static void main(String[] args) {
		print(new Random().nextInt(26));
		// print(8);
	}
}
