package DifferentWaysToCreateObjects;

public class UsingNewInstance {

	String name = "DifferentWaysToCreateObjects";

	public static void main(String[] args) {
		try {
			Class cls = Class.forName("UsingNewInstance");
			UsingNewInstance obj = (UsingNewInstance) cls.newInstance();
			System.out.println(obj.name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}

//O/P :- DifferentWaysToCreateObjects