package Programming;

import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
	int val  = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<Integer> ();
		set.add(new Integer(2));
		set.add(new Integer(1));
		System.out.println(set);//[1, 2]
		
		Demo1 obj = new Demo1();
        System.out.println(obj.val);//10
		
	}

}
