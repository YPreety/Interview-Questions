package GCAndFinalize;

////Calling garbage collector thread explicitly

public class demo155 {

	public static void main(String[] args) {
		F a1 = new F(10);
		F a2 = new F(20);
		a1 = a2;
		System.gc(); // OR call Runtime.getRuntime().gc();
		System.out.println("done");
	}
}

class F {
	int i;

	public F(int i) {
		this.i = i;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("From Finalize Method, i = " + i);
	}
}

/*
done
From Finalize Method, i = 10
*/