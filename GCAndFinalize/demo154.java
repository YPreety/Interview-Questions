package GCAndFinalize;

//Making finalize() method to execute forcefully
public class demo154 {

	public static void main(String[] args) {
		E a1 = new E();
		E a2 = new E();
		a1 = a2;
		Runtime.getRuntime().runFinalization();
		System.out.println("done"); //done
	}
}

class E {
	int i = 50;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("From Finalize Method");
	}
}