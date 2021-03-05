package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//IOException : It is thrown when an input-output operation failed or interrupted
public class IO_Exception {

	public static void main(String[] args) {
		FileInputStream f = null;
		try {
			f = new FileInputStream("abc.txt");
			int i;
			while ((i = f.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			// f.close();
			System.out.println("IOException");
		}
	}
}
