package DifferentWaysToCreateObjects;

import java.lang.reflect.Constructor;

//Using newInstance() method of Constructor class
public class UsingNewInstanceMethod {

	private String name;

	UsingNewInstanceMethod() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		try {
			Constructor<UsingNewInstanceMethod> constructor = UsingNewInstanceMethod.class.getDeclaredConstructor();
			UsingNewInstanceMethod r = constructor.newInstance();
			r.setName("DifferentWaysToCreateObjects");
			System.out.println(r.name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//O/P :- DifferentWaysToCreateObjects