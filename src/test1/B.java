package test1;

public class B {

	public static void main(String[] args) {
		System.out.println(sqrtPiSqr());
	}

	private static double sqrtPiSqr() {
		// Storing constant values of PI and power
		final double PI = Math.PI;
		final int POWER = 2;

		// Solving equation and return value
		return Math.sqrt(Math.pow(PI*PI,POWER));
	}
}
