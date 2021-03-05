package CoreJava;

import java.util.ArrayList;
import java.util.List;

public class SortingWithLambdaExpression {

	public static void main(String[] args) {
		List<Student88> studentlist = new ArrayList<Student88>();
		studentlist.add(new Student88("Jon", 22, 1001));
		studentlist.add(new Student88("Steve", 19, 1003));
		studentlist.add(new Student88("Kevin", 23, 1005));
		studentlist.add(new Student88("Ron", 20, 1010));
		studentlist.add(new Student88("Lucy", 18, 1111));
		System.out.println("Before Sorting the student data:");

		// java 8 forEach for printing the list
		studentlist.forEach((s) -> System.out.println(s));

		System.out.println("After Sorting the student data by Age:");
		// Lambda expression for sorting by age
		studentlist.sort((Student88 s1, Student88 s2) -> s1.getAge() - s2.getAge());

		// java 8 forEach for printing the list
		studentlist.forEach((s) -> System.out.println(s));

		System.out.println("After Sorting the student data by Name:");
		// Lambda expression for sorting the list by student name
		studentlist.sort((Student88 s1, Student88 s2) -> s1.getName().compareTo(s2.getName()));
		studentlist.forEach((s) -> System.out.println(s));
		
		System.out.println("After Sorting the student data by Id:");
		// Lambda expression for sorting the list by student id
		studentlist.sort((Student88 s1, Student88 s2) -> s1.getId() - s2.getId());
		studentlist.forEach((s) -> System.out.println(s));

	}

}

class Student88 {
	String name;
	int age;
	int id;

	public Student88(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student88 [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}