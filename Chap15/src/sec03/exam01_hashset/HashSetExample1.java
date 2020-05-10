package sec03.exam01_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("ÃÑ °´Ã¼¼ö: " + size);
		System.out.println("");

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		System.out.println("");

		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("ÃÑ °´Ã¼¼ö" + set.size());
		System.out.println("");

		for (String element : set) {
			System.out.println(element);
		}
		System.out.println("");

		set.clear();
		if (set.isEmpty()) {
			System.out.println("ºñ¾î ÀÖÀ½");
		} else {
			System.out.println("ºñ¾î ÀÖÁö ¾ÊÀ½");
		}
	}
}
