package Programming;

public class Demo18 implements Runnable {

	public void run() {
		System.out.printf("GFG ");
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Demo18());
		thread1.start();
		thread1.start();
		System.out.println(thread1.getState());

	}

}
/*
 * Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at Programming.Demo18.main(Demo18.java:12)
GFG 
 */
