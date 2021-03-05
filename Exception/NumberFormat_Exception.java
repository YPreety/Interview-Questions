package Exception;

//NumberFormatException : This exception is raised when a method could not convert a string into a numeric format.
public class NumberFormat_Exception {

	public static void main(String[] args) {
		try {
			// "akki" is not a number
			int num = Integer.parseInt("akki");

			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println("Number format exception");
		}

	}

}
