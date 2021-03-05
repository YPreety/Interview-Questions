package Programming;

import java.util.*;

public class Demo16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		System.out.println(" enter the values : int , double  and string");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int j = scan.nextInt();
		double d1 = scan.nextDouble();
		
		System.out.println(i + j);
		System.out.println(d + d1);
		//String s3 = (new StringBuilder()).append(s).append(name).toString();
		System.out.println(s.concat(name));
	}

}
