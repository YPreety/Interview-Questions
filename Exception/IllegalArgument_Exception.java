package Exception;

import java.util.Random;

//IllegalArgumentException : This occurs when the argument passed is not positive.

public class IllegalArgument_Exception {

	public static void main(String[] args) {
		Random ran = new Random();

		// generating number btween 0 and -12345
		// Raises Runtime error, as n is negative.
		int nxt = ran.nextInt(-12345);

		System.out.println("Generated Random number is : " + nxt);

	}

}
