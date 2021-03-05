package CoreJava.MethodOverLoading;

public class WithTypePromotionCaseOfAmbiguity {

	public static void main(String[] args) {
		WithTypePromotionCaseOfAmbiguity obj = new WithTypePromotionCaseOfAmbiguity();
		obj.sum(20, 20);// now ambiguity

	}

	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

}
