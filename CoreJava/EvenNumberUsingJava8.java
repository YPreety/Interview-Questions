package CoreJava;

import java.util.*;
import java.util.stream.Collectors;

public final class EvenNumberUsingJava8 {
	
	public static void main(String[] args) {		
    List<Integer> list =Arrays.asList(1,2,3,4,5);
    
   List<Integer>  number = list.stream()
		                  .filter(s->s%2 ==0 )
		                  .collect(Collectors.toList());
   
   System.out.println(number);
     
		

	}

}


