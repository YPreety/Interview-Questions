package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//FileNotFoundException : This Exception is raised when a file is not accessible or does not open.
public class FileNotFound_Exception {

	public static void main(String[] args) {
		try {

			// Following file does not exist
			File file = new File("E:// file.txt");

			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		}
	}
}
