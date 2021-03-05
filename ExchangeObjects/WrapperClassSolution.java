package ExchangeObjects;

//if we don’t know members of Car
/*no = 2, model = 202
no = 1, model = 101*/
class Car1 {
	int model, no;

	// Constructor
	Car1(int model, int no) {
		this.model = model;
		this.no = no;
	}

	// Utility method to print Car
	void print() {
		System.out.println("no = " + no + ", model = " + model);
	}
}

class CarWrapper {
	Car1 c;

	// Constructor
	CarWrapper(Car1 c) {
		this.c = c;
	}
}

public class WrapperClassSolution {

	public static void swap(CarWrapper cw1, CarWrapper cw2) {
		Car1 temp = cw1.c;
		cw1.c = cw2.c;
		cw2.c = temp;
	}

	// Driver method
	public static void main(String[] args) {
		Car1 c1 = new Car1(101, 1);
		Car1 c2 = new Car1(202, 2);
		CarWrapper cw1 = new CarWrapper(c1);
		CarWrapper cw2 = new CarWrapper(c2);
		swap(cw1, cw2);
		cw1.c.print();
		cw2.c.print();
	}

}


