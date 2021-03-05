package CoreJava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Example {

	public static void main(String[] args) {
         int i =0;
		// convert list to map
		System.out.println( i++ + "======convert list to map========");
		List<String> list = Arrays.asList("A", "B", "C", "D");
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(Function.identity(), String::hashCode));
		System.out.println(map); /// {A=65, B=66, C=67, D=68}

		// get the squares of the given list
		System.out.println(i++ + "======get the squares of the given list======");
		List<Integer> list1 = Arrays.asList(3, 5, 6, 7, 8);
		List<Integer> square = list1.stream().map(x -> x * x).distinct().collect(Collectors.toList());
		System.out.println(square);// [9, 25, 36, 49, 64]

		// Counting Empty String
		System.out.println(i++ + "=======Counting Empty String=======");
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long count = strList.stream().filter(x -> x.isEmpty()).count();
		System.out.println(count); // 2

		System.out.println(i++ + "=====convert array of sting to list=======");
		String[] firstArray = { "test1", "", "test2", "test4", "", null };
		firstArray = Arrays.stream(firstArray).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);
		System.out.println(Arrays.asList(firstArray));// [test1, test2, test4]

		// Count String whose length is more than three
		System.out.println(i++ + "======Count String whose length is more than three===========");
		List<String> strList1 = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		long length = strList1.stream().filter(s -> s.length() > 3).count();
		System.out.println(length); // 1

		// Count number of String which starts with "a"
		System.out.println(i++ + "======Count number of String which starts with a===========");
		List<String> strList2 = Arrays.asList("abc", "", "abcd", "", "defg", "jk");
		long countA = strList2.stream().filter(x -> x.startsWith("a")).count();
		System.out.println(countA); // 2

		// Remove all empty Strings from List
		System.out.println(i++ + "======Remove all empty Strings from List===========");
		List<String> strList3 = Arrays.asList("abc", "", "abcd", "", "defg", "jk");
		List<String> filter = strList3.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(filter); // [abc, abcd, defg, jk]

		// Create a List with String more than 2 characters
		System.out.println(i++ + "======Create a List with String more than 2 characters===========");
		List<String> strList4 = Arrays.asList("abc", "", "abcd", "", "defg", "jk");
		List<String> filter1 = strList4.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.println(filter1); // [abc, abcd, defg]

		// Convert String to uppercase and Join them with coma
		System.out.println(i++ + "======Convert String to uppercase and Join them with coma===========");
		List<String> strList5 = Arrays.asList("abc", "asa", "abcd", "hjj", "defg", "jk");
		String str = strList5.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(str);// ABC,ASA,ABCD,HJJ,DEFG,JK

		// Get count, min, max, sum, and the average for numbers
		System.out.println(i++ + "======Get count, min, max, sum, and the average for numbers===========");
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println(stats); // IntSummaryStatistics{count=10, sum=129,
									// min=2, average=12.900000, max=29}

		// get distinct integer value
		System.out.println(i++ + "======get distinct integer value===========");
		List<Integer> strList6 = Arrays.asList(1, 1, 2, 3, 4, 2, 5, 3, 5, 4, 6, 8, 9);
		List<Integer> distinct = strList6.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);// [1, 2, 3, 4, 5, 6, 8, 9]

		// count person starts with p
		System.out.println(i++ + "======count person starts with p===========");
		List<Person11> personList = Arrays.asList(new Person11("Ma", 38), new Person11("Pa", 36),
				new Person11("Pi", 38), new Person11("gg", 36));
		List<Person11> fileterPerson = personList.stream().filter(p -> p.name.startsWith("P"))
				.collect(Collectors.toList());
		fileterPerson.forEach(x -> System.out.println(x)); // Person11 [name=Pa, age=36]Person11 [name=Pi, age=38]

		// count list of square for all distinct number
		System.out.println(i++ + "======count list of square for all distinct number===========");
		List<Integer> strList7 = Arrays.asList(1, 1, 2, 3, 4, 2, 5, 3, 5, 4, 6, 8, 9);
		List<Integer> distinctSquare = strList7.stream().map(x->x*x).distinct().collect(Collectors.toList());
		System.out.println(distinctSquare);// [1, 4, 9, 16, 25, 36, 64, 81]
		
		//sort list
		System.out.println(i++ + "======sort list===========");
		Stream<String> names = Stream.of("a","d","b","123","c");
		List<String> sorted = names.sorted().collect(Collectors.toList());
		System.out.println(sorted);//[123, a, b, c, d]
		
	}

}

class Person11 {
	String name;
	int age;

	public Person11(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person11 [name=" + name + ", age=" + age + "]";
	}

}