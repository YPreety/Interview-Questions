package CoreJava.MethodOverLoading;

public class ChangingReturntypeOfMethod {

	public static void main(String[] args) {
		System.out.println(Adder.add(11, 11));// ambiguity

	}

}

class Adder2 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(int a, int b) {
		return a + b;
	}
}
///Compile Time Error: method add(int,int) is already defined in class Adder2