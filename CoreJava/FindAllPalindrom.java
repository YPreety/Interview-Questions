package CoreJava;

import java.util.*;

public class FindAllPalindrom {

	public static void main(String[] args) {
		String str = "abaaa";
		List<String> set = findAllPalindrom(str);
		for(String st : set){
			System.out.println(st);
		}
	}

	private static List<String> findAllPalindrom(String str) {
		List<String> set = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (isPalindrom(str.substring(i, j))) {
					set.add(str.substring(i, j));
				}
			}
		}
		return set;
	}

	private static boolean isPalindrom(String str) {
		StringBuilder sb = new StringBuilder(str);
		StringBuilder rev = sb.reverse();
		return (rev.toString().equals(str));
	}

}
