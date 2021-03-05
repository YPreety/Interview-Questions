package Programming;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parent{
	protected void m1(){
		System.out.println(" inside parent");
	}
}

class Child extends Parent{
	private void m1(){
		System.out.println(" inside child");
	}
}