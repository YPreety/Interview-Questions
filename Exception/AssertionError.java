package Exception;

import java.util.ArrayList;
import java.util.List;

//exception rises explicitly by the programmer or by API developer to indicate that assert statement fails.
public class AssertionError {
/*
	public static void main(String[] args) {
		assert(x >= 10);

	}
*/
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add(“Britto”);
		nameList.add(“Shaw”);
		unsafeAdd(strings, new Integer(42));
		}
		private static void unsafeAdd(List list, Object o) {
		list.add(o);
		}
}
