package CoreJava;

import java.util.*;

public class MostRepeatedNumber {

	public static void main(String[] args) {
		//int arr[] = { 2, 5, 6, 2, 8, 2, 6, 5, 2, 5 };
		String arr [] = {"a","b","a","e","a","e","d","b","a"};

		//Map<Integer, Integer> map = new HashMap<>();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		String keyValue = ""; 
		int value = 0;
		System.out.println(map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > value) {
				value = entry.getValue();
				keyValue = entry.getKey();
			}
			
		}
		System.out.println(keyValue);
	}

}
