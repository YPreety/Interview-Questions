package Programming;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arrays.asList("Fred", "jim", "Sheila")
		.stream()
		.peek(System.out::println)
		.allMatch(s -> s.startsWith("F"));  // fred jim
	}

}
