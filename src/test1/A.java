package test1;

public class A {
	// defined two number that will either added or multiplied
	static int num1 = 1;
	static int num2 = 1;
	// result stored in static variable
	static int result = 0;
	// iteration( or total steps) also stored in static variable
	static int iteration = 0;
	// isEven will bw used to check if whether two numbers will be added or multiplied
	static boolean isEven = false;

	public static void main(String[] args) {
		// method1() is called to start executing program
		method1();
		// print total steps
		System.out.println(iteration);
	}

	public static void method1() {
		// this while loop keep looping until result is result is bigger than 10000
		// adjust value in while loop expression to get steps for different number
		while(result < 10000) {
			// compute() will decides whether two number added or multiplied
			result = compute(num1, num2);
			// if result is less then 10000, each iteration of while loop increase value by 1
			if (result < 10000){
				iteration++;
			}
			// num1 value updated by assigning value of result variable
			num1 = result;
			// num2 value increased by 1 for each iteration
			num2++;
		}
	}

	public static int compute(int num1, int num2) {
		// isEven is used to decides whether two number added or multiplied
		if (isEven) {
			// after decision value of isEven changed
			isEven = !isEven;
			return add(num1, num2);
		}
		else {
			// same goes for else
			isEven = !isEven;
			return multiply(num1, num2);
		}
	}

	// multiplication of two number
	private static int multiply(int num1, int num2) {
		return num1+num2;
	}

	// addition of two number
	private static int add(int num1, int num2) {
		return num1*num2;
	}
}

