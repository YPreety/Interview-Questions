package Programming;

import java.io.Closeable;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		try (MyResource1 r1 = new MyResource1(); MyResource2 r2 = new MyResource2();) {
			System.out.print("try ");  // 1
		} catch (Exception e) {
			System.out.print("catch "); //4
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getClass().getName());
			}
		}
	}

}

class MyResource1 implements Closeable {
	public void close() {
		System.out.print("r1 ");   //3
	}
}

class MyResource2 implements AutoCloseable {
	public void close() throws IOException {
		System.out.print("r2 ");  //2
		throw new IOException();
	}
}
