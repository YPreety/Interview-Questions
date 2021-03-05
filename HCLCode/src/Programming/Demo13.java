package Programming;

public class Demo13 {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls = Class.forName("Demo13");
		Demo13 obj = (Demo13) cls.newInstance();
		System.out.println(obj.getClass().getName());//"main" java.lang.ClassNotFoundException: Demo13

	}

}
