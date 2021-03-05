package CoreJava;

import java.util.*;

public class ComparatorInterface {

	public static void main(String[] args) {
		// Creating a list of students
		ArrayList<Student56> al = new ArrayList<Student56>();
		al.add(new Student56(101, "Vijay", 23));
		al.add(new Student56(106, "Ajay", 27));
		al.add(new Student56(105, "Jai", 21));

		System.out.println("Sorting by Name");
		// Using NameComparator to sort the elements
		Collections.sort(al, new NameComparator());
		// Traversing the elements of list
		for (Student56 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("=================================");
		System.out.println("sorting by Age");
		// Using AgeComparator to sort the elements
		Collections.sort(al, new AgeComparator());
		// Travering the list again
		for (Student56 st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}

class AgeComparator implements Comparator<Student56> {
	public int compare(Student56 s1, Student56 s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student56> {
	public int compare(Student56 s1, Student56 s2) {
		return s1.name.compareTo(s2.name);
	}
}

class Student56 {
	int rollno;
	String name;
	int age;

	Student56(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}