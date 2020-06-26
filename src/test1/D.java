package test1;

import java.util.Scanner;

public class D {

	// result stored in static variable
	static double result = 0;

	public static void main(String[] args) {
		// scanner class to get input from user
		Scanner scn = new Scanner(System.in);

		System.out.print("Please enter a value of n :");

		// storing user provided value to integer n
		int n = scn.nextInt();

		// method4() is called to start executing program
		method4(n);
		// print result on console
		System.out.println(result);
		// closing connection of scanner class
		scn.close();
	}

	private static void method4(int n) {
		// is is the iteration of while loop
		int i = 1;
		// loop will be continued for n steps
		while (i<=n) {
			// expression resolved and added to result
			result += (Math.pow(i,i));
			i++;
		}
	}

}
