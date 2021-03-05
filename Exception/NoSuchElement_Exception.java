package Exception;

import java.util.LinkedList;

public class NoSuchElement_Exception {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Trying to get first element at index 7
		// throws exception
		System.out.println("The first element of list is : " + list.getFirst());

	}

}
