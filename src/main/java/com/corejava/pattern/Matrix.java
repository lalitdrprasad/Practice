package com.corejava.pattern;

import java.util.Random;

@SuppressWarnings("unused")
public class Matrix {

	static void print(int n) {
		int rows = n;
		int cols = n;
		System.out.println("Rows = " + rows);
		System.out.println("Cols = " + cols);

		for (int i = 0; i < rows; i++) {
			System.out.printf("Row - %2d : ", i);
			for (int j = 0; j < cols; j++) {
				System.out.printf("%4d-%d", i, j);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// print(new Random().nextInt(40));
		print(8);
	}

}
