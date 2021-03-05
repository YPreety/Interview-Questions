package Exception;

//NullPointerException : This exception is raised when referring to the members of a null object. Null represents nothing
public class NullPointer_Exception {

	public static void main(String[] args) {
		try {
			String a = null; // null value
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}

	}

}
