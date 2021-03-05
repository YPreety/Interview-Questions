package Exception;

//exception occurs whenever while executing static variable assignment and static block if any Exception occurs.
public class ExceptionInInitializerError {

	static {
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
