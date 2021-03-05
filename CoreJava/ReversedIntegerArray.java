package CoreJava;
import java.util.*;

public class ReversedIntegerArray {
	public static void main(String[] args) {
		int a[] = { 1, 5, 6, 3, 4 };
		for (int i = a.length - 1; i >= 0; i--) { // 4 3 6 5 1
			System.out.println(a[i]);
		}
		System.out.println("==========================");
		Integer[] myArray = { 1, 3, 5, 7, 9 };
		reverse(myArray);

		System.out.println("==========================");
		int[] intArray = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		reverseArray(intArray, intArray.length);
	}

	private static void reverse(Integer[] myArray) {
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Reversed Array:" + Arrays.asList(myArray));

	}

	static void reverseArray(int intArray[], int size) {
		int i, k, temp;
		for (i = 0; i < size / 2; i++) {
			temp = intArray[i];
			intArray[i] = intArray[size - i - 1];
			intArray[size - i - 1] = temp;
		}
		System.out.println("Reversed Array: \n" + Arrays.toString(intArray));
	}

}
