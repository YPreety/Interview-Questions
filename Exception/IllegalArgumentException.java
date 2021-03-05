package Exception;

//The Exception occurs explicitly either by the programmer or by API developer to indicate that a method has 
//been invoked with Illegal Argument.
public class IllegalArgumentException {

	public static void main(String[] args) {
		Thread t = new Thread();
		Thread t1 = new Thread();
		t.setPriority(7); // Correct
		t1.setPriority(17); // Exception

	}

}
