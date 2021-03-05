package Exception;

public class ClassCast_Exception {

	public static void main(String[] args) {
		String s = new String("Geeks");
		Object o = (Object) s;
		Object o1 = new Object();
		String s1 = (String) o1;

	}

}
