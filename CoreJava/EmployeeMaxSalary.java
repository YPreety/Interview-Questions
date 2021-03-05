package CoreJava;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMaxSalary {

	public static void main(String[] args) {
		List<Employee55> employees = Arrays.asList(new Employee55(1276, "FFF", 2000.00),
				new Employee55(7865, "AAA", 1200.00), new Employee55(4975, "DDD", 3000.00),
				new Employee55(4499, "CCC", 1500.00), new Employee55(9937, "GGG", 2800.00),
				new Employee55(5634, "HHH", 1100.00), new Employee55(9276, "BBB", 3200.00),
				new Employee55(6852, "EEE", 3400.00));

		System.out.println("======Original List===========");
		printList(employees);

		// Using sequential stream
		System.out.println("======sorted using sequential stream===========");
		List<Employee55> sortedItems = employees.stream().sorted(Comparator.comparing(Employee55::getName))
				.collect(Collectors.toList());

		printList(sortedItems);

		// Using parallel stream
		System.out.println("======sorted using parallel stream===========");
		List<Employee55> anotherSortedItems = employees.parallelStream()
				.sorted(Comparator.comparing(Employee55::getName)).collect(Collectors.toList());

		printList(anotherSortedItems);

		System.out.println("======Total Salary expense===========");
		double totsal = employees.parallelStream().map(e -> e.getSalary()).reduce(0.00, (a1, a2) -> a1 + a2);
		System.out.println("Total Salary expense: " + totsal);// Total Salary expense: 18200.0
																
		System.out.println("======Max salary===========");

		Optional<Employee55> maxSal = employees.parallelStream()
				.reduce((Employee55 e1, Employee55 e2) -> e1.getSalary() < e2.getSalary() ? e2 : e1);
		if (maxSal.isPresent())
			System.out.println(maxSal.get().toString()); // Employee [empid=6852, name=EEE, salary=3400.0]

		System.out.println("======salary >3000.00 ===========");

		List<Employee55> sal = employees.parallelStream().filter(x -> x.getSalary() > 3000.00)
				.collect(Collectors.toList());
		System.out.println(sal); // [Employee [empid=9276, name=BBB, salary=3200.0], Employee [empid=6852, name=EEE, salary=3400.0]]
	}

	public static void printList(List<Employee55> list) {
		for (Employee55 e : list)
			System.out.println(e.toString());
	}

}

class Employee55 {
	private int empid;
	private String name;
	private double salary;

	public Employee55() {
		super();
	}

	public Employee55(int empid, String name, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}