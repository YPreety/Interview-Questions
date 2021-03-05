package Programming;

public class Demo6 implements Runnable {

	public void run() {
		System.out.printf("GFG ");  //2
		System.out.printf("Geeks "); //3
	}

	public static void main(String[] args) {
		Demo6 obj = new Demo6();
		Thread thread = new Thread(obj);

		thread.start();
		System.out.printf("Geekss "); //1
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("for "); //4

	}

}
