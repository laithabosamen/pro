package programming;

import java.util.Scanner;

public class Rd {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("enter num:");
		int w = t.nextInt();
		int row;
		for (row = w; row > 0; row--) {
			for (int x = 0; x < row; x++) {
				System.out.print(" ");
			}
			System.out.print("*\n");
		}
	}
}
