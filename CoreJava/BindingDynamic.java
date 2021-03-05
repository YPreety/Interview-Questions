package CoreJava;

public class BindingDynamic extends Animal {

	void eat() {
		System.out.println("dog is eating...");
	}

	public static void main(String[] args) {
		Animal a = new BindingDynamic();
		a.eat();//dog is eating...
		
		Animal a1 = new Animal();
		a1.eat();//animal is eating...
		
		BindingDynamic b = new BindingDynamic();
		b.eat();//dog is eating...
		
		//BindingDynamic b1 = new Animal(); // compiler error
		//b1.eat();

	}

}

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}