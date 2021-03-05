package Programming;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		System.out.println(s1); //JavaLove
		s1.substring(4);
		System.out.println(s1); //JavaLove
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);  //4
	}

}
