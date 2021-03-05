package CoreJava;

import java.util.*;

public class ListToMap {

	public static void main(String[] args) {
		List<Alphabet> list = new ArrayList<>();
		list.add(new Alphabet("a", "a"));
		list.add(new Alphabet("b", "ab"));
		list.add(new Alphabet("c", "abc"));
		list.add(new Alphabet("d", "abcd"));

		Map<String, String> map = new HashMap<>();

		for (Alphabet al : list) {
			map.put(al.getKey(), al.getValue());
		}

		System.out.println(map);
	}

}

class Alphabet {
	private String key;
	private String value;

	public Alphabet(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Alphabet [key=" + key + ", value=" + value + "]";
	}

}