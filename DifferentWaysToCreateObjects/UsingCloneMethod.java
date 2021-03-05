package DifferentWaysToCreateObjects;

//Class need to implement Cloneable Interface otherwise it will throw CloneNotSupportedException.
public class UsingCloneMethod implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	String name = "DifferentWaysToCreateObjects";

	public static void main(String[] args) {
		UsingCloneMethod obj1 = new UsingCloneMethod();
		try {
			UsingCloneMethod obj2 = (UsingCloneMethod) obj1.clone();
			System.out.println(obj2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

//O/P :- DifferentWaysToCreateObjects