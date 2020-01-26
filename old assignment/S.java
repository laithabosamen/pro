package programming;

import java.util.Scanner;

public class S {
	public static void main(String[] args) {
		Scanner how = new Scanner(System.in);
		System.out.print("enter num:");
		int n = how.nextInt();
		int l = 0;

		for (int i = 0; i < n * n; i++) {
			if (l % n == 0) {
				System.out.println("");
			}
			System.out.print("*");
			l++;
		}
	}
}
