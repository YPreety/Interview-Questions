package CoreJava;

import java.util.*;

public class FindUniqueCharacter {

	public static void main(String[] args) {
		String str = "abcdaadfg";

		repetaedChar(str);

	}

	private static void repetaedChar(String str) {

		Map<Character, Integer> map = new HashMap<>();

		char[] ch = str.toCharArray();
		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey());
			}
		}
	}

}
