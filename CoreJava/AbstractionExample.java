package CoreJava;

public class AbstractionExample extends Bike {

	public static void main(String[] args) {
		Bike obj = new AbstractionExample();
		obj.run();
		obj.show();
	}

	@Override
	void run() {
		System.out.print(" running safely");
	}
}

abstract class Bike {
	abstract void run();
	public void show() {
		System.out.print(" inside show");
	}
}