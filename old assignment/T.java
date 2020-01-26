package programming;

import java.util.Scanner;

public class T {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("enter num:");
		int w = t.nextInt();
		String l = "*";
		for (int i = 0; i < w; i++) {
			System.out.println("" + l);
			l = l + '*';
		}
	}
}