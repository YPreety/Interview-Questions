package Programming;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("10");
		test(new Integer(new Integer("20")));
		test(new Integer("30"));
		test(new Integer("null"));
		test("null");

	}

	private static void test(String string) {
		System.out.print(string.toString()); //Unresolved compilation problems:
		
	}
}
