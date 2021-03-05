package CoreJava;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("d");
		set.add("f");
		set.add("a");
		set.add("c");
		set.add("b");
		set.add("g");
		set.add("e");
		
		System.out.println(set);//[a, b, c, d, e, f, g]

	}

}
