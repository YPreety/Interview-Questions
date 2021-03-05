package Exception;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModification_Exception extends Thread {

	static ArrayList l = new ArrayList();

	public static void main(String[] args) throws InterruptedException {
		l.add("A");
		l.add("B");
		l.add("c");
		ConcurrentModification_Exception t = new ConcurrentModification_Exception();
		t.start();
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
			Thread.sleep(6000);
		}
		System.out.println(l);

	}

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("Child Thread" + " going to add element");
		}
		l.add("D");
	}
}
