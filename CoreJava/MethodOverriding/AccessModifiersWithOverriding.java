package CoreJava.MethodOverriding;

public class AccessModifiersWithOverriding extends A {

	public static void main(String[] args) {
		AccessModifiersWithOverriding obj = new AccessModifiersWithOverriding();
		obj.msg();

	}

	void msg() {
		System.out.println("Hello java");
	}// C.T.Error    Cannot reduce the visibility of the inherited method from A

}

class A {
	protected void msg() {
		System.out.println("Hello java");
	}
}