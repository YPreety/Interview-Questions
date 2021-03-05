package Programming;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Demo21 implements Runnable {

	public static CyclicBarrier barrier = new CyclicBarrier(3);

	public void run() {
		System.out.printf(" GFG ");
		try {
			try {
				barrier.await();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Demo21());
		Thread thread2 = new Thread(new Demo21());

		thread1.start();
		thread2.start();
		System.out.printf(" GeeksforGeeks ");
		try {
			try {
				barrier.await();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf(" End ");

	}

}
