package GCAndFinalize;

//In some scenarios, finalize() method is not at all called by the garbage collector thread.
public class demo153 {

	public static void main(String[] args) {
		D a1 = new D();
		D a2 = new D();
		a1 = a2;
		System.out.println("done"); //done
	}
}

class D {
	int i = 50;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("From Finalize Method");
	}
}