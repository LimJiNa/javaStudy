package sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();

		map.put(new Student(1, "ȫ�浿"), 95);
		map.put(new Student(1, "ȫ�浿"), 90);
		System.out.println("�� Entry��: " + map.size());
		System.out.println("");

		System.out.println(map.get(new Student(1, "ȫ�浿")));
	}
}
