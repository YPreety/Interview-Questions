package InterfaceDemo;

interface printable {
	void print();
}

public class Example1 {

	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.print();

	}

	public void print() {
		System.out.println("Hello");
	}

}
