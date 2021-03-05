package AbstractClass;

///Example of abstract class that has abstract method

public class AbstractClassWithAbstractMethod extends Bike{

	public static void main(String[] args) {
		Bike obj = new AbstractClassWithAbstractMethod();
		obj.run();

	}

	void run() {
		System.out.println("running safely..");
	}

}

abstract class Bike {
	abstract void run();
}