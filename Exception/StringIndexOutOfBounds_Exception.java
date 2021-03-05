package Exception;

/*StringIndexOutOfBoundsException : It is thrown by String class methods to indicate that an index is either negative 
than the size of the string.*/
public class StringIndexOutOfBounds_Exception {

	public static void main(String[] args) {
		try {
			String a = "This is like chipping "; // length is 22
			char c = a.charAt(24); // accessing 25th element
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}

	}

}
