package DifferentWaysToCreateObjects;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;

public class UsingDeserializationExample {

	public static void main(String[] args) {
		try {
			UsingDeserializationExample d;
			FileInputStream f = new FileInputStream("file1.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			d = (UsingDeserializationExample) oos.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(d.name);

	}

}
