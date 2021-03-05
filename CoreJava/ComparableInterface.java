package CoreJava;

import java.util.*;

public class ComparableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student123> al = new ArrayList<Student123>();
		al.add(new Student123(101, "Vijay", 23));
		al.add(new Student123(106, "Ajay", 27));
		al.add(new Student123(105, "Jai", 21));

		Collections.sort(al);
		for (Student123 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}

class Student123 implements Comparable<Student123> {
	int rollno;
	String name;
	int age;

	Student123(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student123 st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}
}