package Exception;

import java.util.LinkedList;

public class IndexOutOfBound_Exception {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements using add()
		list.add("Geeks");
		list.add(4);
		list.add("Geeks");
		list.add("8");

		// Trying to get element at index 7
		// throws exception
		System.out.println("The element at index 7 is : " + list.get(7));

	}

}
