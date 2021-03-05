package CoreJava;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = " I am learning java";
		reverseString(str);
	}

	private static void reverseString(String str) {
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		System.out.println(reverseWord.trim());

	}

}
