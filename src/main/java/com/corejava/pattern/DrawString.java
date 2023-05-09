package com.corejava.pattern;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class DrawString {

	String character = null;
	String space = "  ";/* space between two character of letter */
	int sleep = 30;/*
					 * time delay for animation effect while printing the characters
					 */

	private void a(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((i == 1) || (j == 1) || (j == cols) || (i == rows / 2)) {
				if (i == 1 && (j == 1 || j == cols)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void b(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;

		for (int j = 1; j <= cols; j++) {
			if ((i == 1) || (j == 1) || (j == cols) || (i == rows / 2) || (i == n)) {

				if ((i == 1 || i == rows / 2 || i == rows) && (j == cols)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void c(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((i == 1) || (j == 1) || (i == rows)) {

				if ((i == 1 || i == rows) && (j == 1)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void d(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((i == 1) || (j == 1) || (j == cols) || (i == rows)) {

				if ((i == 1 || i == n) && (j == cols)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void e(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((i == 1) || (j == 1) || (i == rows) || i == rows / 2) {

				if ((i == 1 || i == rows) && (j == 1)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void f(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((i == 1) || (j == 1) || (i == rows / 2)) {

				if (i == 1 && (j == 1)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void g(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((i == 1) || (j == 1) || (i == rows) || (j == cols && i >= rows / 2)
					|| (i == rows / 2 && j > cols / 2)) {

				if ((i == 1 || i == rows) && (j == 1 || j == cols) || (i == rows / 2 && j == cols)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void h(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((j == 1) || (j == cols) || (i == rows / 2)) {

				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void i(int n, int i, String character) {
		int rows = n;
		int cols = n;
		if (cols % 2 == 0)
			cols++;

		for (int j = 1; j <= cols; j++) {
			if (i == 1 || i == rows || j == cols / 2 + 1) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void j(int n, int i, String character) {
		int rows = n;
		int cols = n;
		for (int j = 1; j < cols; j++) {
			if ((i == 1 || j == cols / 2) || (j == 1 && i > rows / 4 + rows / 2) || (i == rows && j <= cols / 2)) {

				if ((i == rows) && (j == 1 || j == cols / 2)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void k(int n, int i, String character) {
		// int rows = n;
		int cols = n / 2;
		for (int j = 1; j <= cols + 1; j++) {
			if (j == 1 || i + j == cols + 2 || i - j == cols - 1) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void l(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j < cols; j++) {
			if (j == 1 || (i == rows && j <= cols)) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void m(int n, int i, String character) {
		int rows = n;
		int cols = n;
		for (int j = 1; j <= cols; j++) {
			if (j == 1 || j == cols - 1 || (i <= rows / 2) && ((i == j || i + j == cols))) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void n(int n, int i, String character) {
		// int rows = n;
		int cols = n;
		for (int j = 1; j <= cols; j++) {
			if (j == 1 || j == cols || i == j) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void o(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if (i == 1 || i == rows || j == 1 || j == cols) {
				if ((i == 1 && j == 1) || (i == rows && j == cols) || (i == rows && j == 1) || (i == 1 && j == cols)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void p(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if (i == 1 || i == rows / 2 + 1 || j == 1 || (j == cols && i <= rows / 2 + 1)) {
				if ((j == cols) && (i == 1 || i == rows / 2 + 1)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void q(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if (i == 1 || i == rows || j == 1 || j == cols || (i - j <= cols / 3 && i - 1 > rows / 2)) {
				if ((i == 1 && j == 1) || (i == rows && j == cols) || (i == rows && j == 1) || (i == 1 && j == cols)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void r(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if (i == 1 || i == rows / 2 + 1 || j == 1 || (j == cols && i <= rows / 2)
					|| (i - j == cols - rows / 3 - 1)) {
				if ((j == cols) && (i == 1 || i == rows / 2 + 1)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void s(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if ((i == 1 || i == rows || i == rows / 2 || j == 1) && i <= rows / 2
					|| ((j == cols || i == rows) && i >= rows / 2)) {
				if ((j == 1) && (i == 1 || i == rows / 2) || (j == cols) && (i == rows || i == rows / 2)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void t(int n, int i, String character) {
		// int rows = n;
		int cols = n;
		if (cols % 2 == 0)
			cols++;

		for (int j = 1; j <= cols; j++) {
			if (i == 1 || j == cols / 2 + 1) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void u(int n, int i, String character) {
		int rows = n;
		int cols = n - n / 4;
		for (int j = 1; j <= cols; j++) {
			if (i == rows || j == 1 || j == cols) {
				if ((i == rows && j == cols) || (i == rows && j == 1)) {
					System.out.print(space);
					continue;
				}
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void v(int n, int i, String character) {
		int rows = n;
		int cols = n * 2;
		for (int j = 1; j <= cols; j++) {

			if (i == j || i + j == cols) {

				print(character.substring(1));
			} else
				System.out.print(" ");
		}
		System.out.print(space);
	}

	private void w(int n, int i, String character) {
		int rows = n;
		int cols = n;
		for (int j = 1; j < cols; j++) {
			if (j == 1 || j == cols - 1 || (i > rows / 2) && ((i - j == 1 || i + j == cols + 1))) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void x(int n, int i, String character) {
		int rows = n;
		int cols = n;
		for (int j = 1; j <= cols; j++) {
			if (i == j || i + j == rows + 1) {
				print(character);
			} else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void y(int n, int i, String character) {
		int rows = n;
		int cols = n;
		for (int j = 1; j < cols; j++) {
			if (((i <= rows / 2) && (i == j || i + j == cols)) || (i > rows / 2 && j == cols / 2))
				print(character);
			else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void z(int n, int i, String character) {
		int rows = n;
		int cols = n;
		if (cols % 2 == 0)
			cols++;
		for (int j = 1; j < cols; j++) {
			if (i == 1 || i == rows || i + j == cols)
				print(character);
			else
				System.out.print(space);
		}
		System.out.print(space);
	}

	private void print(String str) {
		try {
			Thread.sleep(sleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print(str);
	}

	public void design(String str, char c) {

		int n = 8;
		str = str + "$";

		character = " " + c;

		List<String> setOfWords = new ArrayList<String>();
		String tmp = "";
		System.out.println("\n");
		// parsing string into words separated by non alphabet
		// characters.
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				tmp = tmp + str.charAt(i);
			} else if (tmp.length() != 0) {
				setOfWords.add(tmp);
				tmp = "";
			}
		}

		for (String word : setOfWords) {
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < word.length(); j++) {

					try {
						this.getClass().getDeclaredMethod(("" + word.charAt(j)).toLowerCase(), int.class, int.class,
								String.class).invoke(this, n, i, character);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
							| NoSuchMethodException | SecurityException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}

	public void design(String str) {

		int n = 8;
		str = str + "$";

		List<String> setOfWords = new ArrayList<String>();
		String tmp = "";
		System.out.println("\n");
		// parsing string into words separated by non alphabet
		// characters.
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				tmp = tmp + str.charAt(i);
			} else if (tmp.length() != 0) {
				setOfWords.add(tmp);
				tmp = "";
			}
		}

		for (String word : setOfWords) {
			for (int i = 1; i <= n; i++) {
				for (int j = 0; j < word.length(); j++) {
					// Design character with character it self.
					character = (" " + word.charAt(j)).toUpperCase();

					try {
						this.getClass().getDeclaredMethod(("" + word.charAt(j)).toLowerCase(), int.class, int.class,
								String.class).invoke(this, n, i, character);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
							| NoSuchMethodException | SecurityException e) {
						e.printStackTrace();
					}
				}
				System.out.println();
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		
		DrawString obj = new DrawString();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to be designed : ");
		String str = sc.nextLine();
		obj.design(str);

		System.out.print("Enter a charater for designing : ");
		char character = sc.next().charAt(0);
		obj.design(str, character);
		sc.close();
		obj = null;
	}
}