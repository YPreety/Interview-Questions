package Programming;

import java.util.HashMap;
import java.util.Map;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<Integer,String> map = new HashMap();
      map.put(0 ,"a");
      map.put(1 ,"b");
      map.put(1 ,"c");
      
      System.out.println(map.get(1));
	}

}
