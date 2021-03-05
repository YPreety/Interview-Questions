package CoreJava;

import java.util.Arrays;
import java.util.*;

public class Anagrams {

	public static void main(String[] args) {
		String s1 = "aabbd";
		String s2 = "ababc";
		if (isAnagram(s1, s2)) {
			System.out.println(" Anagram");
		} else {
			System.out.println(" not Anagram");
		}

	}

	private static boolean isAnagram(String s1, String s2) {
		String c1 = s1.replaceAll("\\s", "");
		String c2 = s2.replaceAll("\\s", "");

		boolean status = false;

		if (c1.length() != c2.length()) {
			status = false;
		} else {
			char[] ch1 = c1.toLowerCase().toCharArray();
			char[] ch2 = c2.toLowerCase().toCharArray();
			// Arrays.sort(ch1);
			// Arrays.sort(ch2);
			// status = Arrays.equals(ch1, ch2);

			Map<Character, Integer> map = new HashMap<>();

			for (Character c : ch1) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}

			Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();

			Map<Character, Integer> map1 = new HashMap<>();

			for (Character c : ch2) {
				if (map1.containsKey(c)) {
					map1.put(c, map1.get(c) + 1);
				} else {
					map1.put(c, 1);
				}
			}
			while (itr.hasNext()) {
				Map.Entry<Character, Integer> entry = itr.next();
				if (map1.containsKey(entry.getKey())) {
					status = true;
				} else {
					status = false;
				}
			}
		}
		return status;
	}

}
