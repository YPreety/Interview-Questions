package DifferentWaysToCreateObjects;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UsingDeserialization implements Serializable {
	private String name;

	UsingDeserialization(String name)
    {
        this.name = name;
    }

	public static void main(String[] args) {
		try {
			UsingDeserialization d = new UsingDeserialization("DifferentWaysToCreateObjects");
			FileOutputStream f = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(f);
			oos.writeObject(d);
			oos.close();
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
