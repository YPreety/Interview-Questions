package Exception;

//NoSuchMethodException : t is thrown when accessing a method which is not found.
public class NoSuchMethod_Exception {

	public static void main(String[] args) {
		new NoSuchMethod_Exception();

	}

	public NoSuchMethod_Exception() {
		Class i;
		try {
			i = Class.forName("java.lang.String");
			try {
				Class[] p = new Class[5];
			} catch (SecurityException e) {
				System.out.println("SecurityException");
			} catch (NoSuchMethodException e) {
				System.out.println("NoSuchMethodException");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		}
	}
}
