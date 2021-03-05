package CoreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<String> l = new ArrayList<String>();
		l.add("java");
		l.add("javascript");
		l.add("preety");
		
		Iterator itr = l.iterator();
		while(itr.hasNext()){
			if(((String) itr.next()).equalsIgnoreCase("preety")){
				itr.remove();
			}
			
		}
		System.out.println(l.size()); //2
*/		
		Person p1 = new Person ("preety" ,"yadav");
		Person p2 = new Person ("veer" ,"singh");
		Person p3 = new Person ("sachin" ,"yadav");
		Person p4 = new Person ("amit" ,"abc");
		
		Set<Person> s = new TreeSet<Person>();
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);
		
		for(Person p : s){
			System.out.println(p.first + " " + p.last);
		}

	}

}

class Person{
	
	String first;
	String last;
	
	public Person(String str1 , String str2){
		this.first = str1;
		this.last = str2;
	}
}
