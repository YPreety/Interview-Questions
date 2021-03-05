package CoreJava;

public class SecondLagestNumber {

	public static void main(String[] args) {
		int arr[] = { 12, 35, 1, 10, 34, 1 };
		secondLargest(arr);
		int secondNo = getSecondLargest(arr);
		System.out.println(secondNo);
	}

	private static void secondLargest(int[] arr) {
		int first = 0;
		int second = 0;
		if (arr[0] > arr[1]) {
			first = arr[0];
			second = arr[1];
		} else {
			first = arr[1];
			second = arr[0];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < first && arr[i] > second) {
				second = arr[i];
			}
		}
		System.out.println(second);

	}

	// other method
	public static int getSecondLargest(int[] a) {
		int total = a.length;
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 2];
	}

}


