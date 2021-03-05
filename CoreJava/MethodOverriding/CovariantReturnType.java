package CoreJava.MethodOverriding;

//it is possible to override method by changing the return type if subclass overrides any method whose return 
//type is Non-Primitive but it changes its return type to subclass type.

public class CovariantReturnType extends A1 {

	CovariantReturnType get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String[] args) {
		new CovariantReturnType().get().message();

	}

}

class A1 {
	A1 get() {
		return this;
	}
}