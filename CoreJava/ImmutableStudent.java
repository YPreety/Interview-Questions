package CoreJava;

import java.util.*;

class ImmutableStudent {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Student77 s = new Student77("ABC", 101, map , list);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());
		System.out.println(s.getMetadata());
		System.out.println(s.getList());

		// Uncommenting below line causes error
		//s.regNo = 102; // visibility issue

		System.out.println("==========================");
		map.put("3", "third");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in constructor

		System.out.println("==========================");
		s.getMetadata().put("4", "fourth");
		System.out.println(s.getMetadata()); // Remains unchanged due to deep copy in getter
		
		System.out.println("==========================");
		list.add(4);
		System.out.println(s.getList()); // Remains unchanged due to deep copy in constructor
		
		System.out.println("==========================");
		s.getList().add(5);
		System.out.println(s.getList()); // Remains unchanged due to deep copy in getter

	}

}

final class Student77 {
	private final String name;
	private final int regNo;
	private final Map<String, String> metadata;
	private final List<Integer> list;

	public Student77(String name, int regNo, Map<String, String> metadata,List<Integer> list) {
		this.name = name;
		this.regNo = regNo;
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		this.metadata = tempMap;
		List<Integer> list1 = new ArrayList<>();
		for(Integer in : list){
			list1.add(in);
		}
		this.list = list1;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Map<String, String> getMetadata() {
		Map<String, String> tempMap = new HashMap<>();
		for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}

	public List<Integer> getList() {
		List<Integer> list1 = new ArrayList<>();
		for(Integer in : this.list){
			list1.add(in);
		}
		return list1;
	}
}