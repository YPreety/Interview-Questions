package Programming;

public class Demo19 extends Thread implements Runnable {

	public void run() {
		System.out.printf("GFG "); //GFG GFG 
	}

	public static void main(String[] args) throws InterruptedException {
		Demo19 obj = new Demo19();
		obj.run();
		obj.start();
	}

}
