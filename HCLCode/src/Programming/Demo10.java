package Programming;

import java.util.TreeSet;

public class Demo10 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("geeks");
		set.add("for");
		set.add("geeks");
		set.add("geeksforgeeks");

		System.out.println(set);//[for, geeks, geeksforgeeks]

	}

}
