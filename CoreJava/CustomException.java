package CoreJava;

public class CustomException {

	public static void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException(" not qualified");
		} else {
			System.out.println("welcome");
		}
	}

	public static void main(String[] args) {
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}

	}

}

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}
}