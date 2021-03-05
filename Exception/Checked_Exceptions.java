package Exception;

import java.io.IOException;

public class Checked_Exceptions {

	public static void main(String[] args) {
		Checked_Exceptions obj = new Checked_Exceptions();
		obj.p();
		System.out.println("normal flow...");
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	void n() throws IOException {
		m();
	}

	void m() throws IOException {
		throw new IOException("device error");
	}
}
