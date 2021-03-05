package Exception;

//InterruptedException : It is thrown when a thread is waiting, sleeping, or doing some processing, and it is interrupted.
public class Interrupted_Exception {

	public static void main(String[] args) {
		Thread t = new Thread();
		try {
			t.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("InterruptedException");
		}

	}
}
