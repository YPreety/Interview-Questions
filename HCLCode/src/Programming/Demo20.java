package Programming;

public class Demo20 implements Runnable {

	public static Demo20 obj;
	private int data;

	public Demo20() {
		data = 10;
	}

	public void run() {
		obj = new Demo20();
		try {
			obj.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.data += 20;

		System.out.println(obj.data);
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Demo20());
		Thread thread2 = new Thread(new myThread());

		thread1.start();
		thread2.start();

		System.out.printf(" GFG - ");
	}

}

class myThread implements Runnable {
	public void run() {
		Demo20.obj.notify();
	}
}