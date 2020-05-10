package sec11.exam01_arrays;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 98 };

		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		System.out.println("");

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println("");

		String[] names = { "ȫ�浿", "�ڵ���", "��μ�" };
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		System.out.println("");

		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		System.out.println("");

		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�ڵ���");
		Member m3 = new Member("��μ�");
		Member[] members = { m1, m2, m3 };
		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		System.out.println("");
		
		for (int i = 0; i < members.length; i++) {
			System.out.println("names[" + i + "].name = " + members[i].name);
		}
	}
}
