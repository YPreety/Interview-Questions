package Exception;

import java.util.TreeMap;

//Null Pointer Exception : Occurs if the map contains a null key or it is null in putAll().

public class TreeMap_putAll_NullPointerException {

	public static void main(String[] args) {
		TreeMap<String, Integer> tmp1 = new TreeMap<String, Integer>();
		TreeMap<String, Integer> tmp2 = new TreeMap<String, Integer>();
		tmp1.put("two", 3);
		tmp1.put("one", 1);

		// assigning in 2nd TreeMap
		tmp2.put("three", 3);
		tmp2.put(null, 2);

		System.out.println("First treemap values are : " + tmp1);

		// use of putAll()
		// Putting 2nd map in 1st map
		tmp1.putAll(tmp2);

		System.out.println("Values after modifying 1st treemap : " + tmp1);

	}

}
