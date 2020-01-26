package programming;

import java.util.Scanner;

public class P {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.print("enter num:");
		  int i, space, rows, q=0;
	        rows = t.nextInt();
	        for(i=1; i<=rows; i++)
	        {
	            for(space=1; space<=(rows-i); space++)
	            {
	                System.out.print("  ");
	            }
	            while(q != (2*i-1))
	            {
	                System.out.print("* ");
	                q++;
	            }
	            q = 0;
	            System.out.println();
	        }
	    }
	
	}
