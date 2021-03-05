package InterfaceDemo;

//Multiple inheritance in Java by interface

public class Example4 implements Printable1, Showable {

	public static void main(String[] args) {
		Example4 obj = new Example4();
		obj.print();
		obj.show();

	}

	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

}

interface Printable1 {
	void print();
}

interface Showable {
	void show();
}