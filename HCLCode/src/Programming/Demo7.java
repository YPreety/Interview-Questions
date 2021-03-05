package Programming;

import java.util.*;

public class Demo7 {

	public static void main(String[] args) {
		// input list of Color objects
		List<Color> colors = new ArrayList<>();

		colors.add(new Color("a", "a"));
		colors.add(new Color("b", "ab"));
		colors.add(new Color("c", "abc"));

		Map<String, String> map = new HashMap<>();

		// construct key-value pairs from name and code fields of Color
		for (Color ob : colors) {
			map.put(ob.getName(), ob.getCode());
		}

		System.out.println("List : " + colors);
		System.out.println("Map  : " + map);

	}

}

class Color {
	private String name;
	private String code;

	public Color(String name, String code) {
		this.name = name;
		this.code = code;
	}

	@Override
	public String toString() {
		return name + "=" + code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}