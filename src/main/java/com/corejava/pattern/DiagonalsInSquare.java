package com.corejava.pattern;

import java.util.Random;

public class DiagonalsInSquare {

	static void print(int n) throws InterruptedException {
		int rows = n;
		int cols = n;
		System.out.println(" N = " + n);

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				if (i == j || i == 1 || i == rows || j == 1 || j == cols || i + j == rows + 1){
					Thread.sleep(25);
					if (j % 2 == 0 || i % 2 == 0)
						System.out.print(" -");
					else
						System.out.print(" +");
			}	else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		print(new Random().nextInt(15) * 2+1);
		// print(15);
	}
}
