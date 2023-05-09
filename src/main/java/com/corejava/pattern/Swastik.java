package com.corejava.pattern;

import java.util.Random;

public class Swastik {

	static void print(int n) throws InterruptedException {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (((i <= n / 2 && (j == 1 || j == 2)) || (i > n / 2 && (j == n || j == n - 1))
						|| (i == n / 2 || i == n / 2 + 1))
						|| ((j > n / 2 && (i == 1 || i == 2)) || (j <= n / 2 && (i == n || i == n - 1))
								|| (j == n / 2 || j == n / 2 + 1))) {
					Thread.sleep(30);
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		print(new Random().nextInt(15) * 2);
		// print(15);
	}
}