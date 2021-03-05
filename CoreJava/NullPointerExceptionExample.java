package CoreJava;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String s = null;
		try {
			// This line of code throws NullPointerException
			// because s is null
			//if (s.equals("gfg")) ////NullPointerException Caught
			if("gfg".equals(s))  // not same
				System.out.print("Same");
			else
				System.out.print("Not Same");
		} catch (NullPointerException e) {
			System.out.print("NullPointerException Caught");  
		}

	}

}
