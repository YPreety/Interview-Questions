package Programming;

public class Demo9 {
	int size = 7;

	public static void main(String[] args) {
		Demo9 a = new Demo9();
		Demo9 b = new Demo9();
		int i1 = 10;
		int i2 = i1;
		go(b, i2);

		System.out.println(a.size + " " + i1+ " " +b.size ); // 7 10 8
	}

	private static void go(Demo9 a, int i2) {
		a.size = 8;
		i2 = 10;

	}

}
