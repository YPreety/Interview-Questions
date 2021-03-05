package CoreJava.MethodOverriding;

public class MethodOverriding {

	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.run();

	}

	void run() {
		System.out.println("Bike is running safely");
	}

}

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}