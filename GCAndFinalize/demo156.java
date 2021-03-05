package GCAndFinalize;

/*
 * You can call finalize() method explicitly on an object before it is abandoned. 
 * When you call, only operations kept in finalize() method are performed on an object. 
 * Object will not be destroyed from the memory.
 * From Finalize Method, i = 10
done
 */
public class demo156 {

	public static void main(String[] args) {
		A a1 = new A(10);
		A a2 = new A(20);
		try {
			a1.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		a1 = a2;
		System.out.println("done");
	}
}

class A {
	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("From Finalize Method, i = " + i);
		// Calling super class finalize() method explicitly
		super.finalize();
	}
}