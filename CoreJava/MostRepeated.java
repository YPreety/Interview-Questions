package CoreJava;

import java.util.Arrays;

public class MostRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,5,6,2,8,2,6,5,2,5};
        
	      //Sorting array in Ascending Order
	      Arrays.sort(arr);
	 
	      int element = Integer.MIN_VALUE, max_count=1, count=1;
	        
	      for(int i=1; i<arr.length; i++){
	        //count the same element
	        if(arr[i] == arr[i-1])
	          count++;
	        else{
	          //Compare the counted frequency with max_count
	          if(count>max_count){
	            //Update if found greater frequency
	            max_count = count;
	            element = arr[i-1];
	          } 
	          //Reset Count
	          count =1;
	        }
	      }
	        
	      System.out.println(" element : " + element+" max count : "+max_count); 
	}

}
