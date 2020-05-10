package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// ���ù�ȣ
		int[] selectNumber1 = new int[6];
		Random random = new Random();
		System.out.print("���ù�ȣ : ");
		for (int i = 0; i < 6; i++) {
			selectNumber1[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber1[i] + " ");
		}
		System.out.println("");

		int[] selectNumber2 = new int[6];
		random = new Random(5);
		System.out.print("���ù�ȣ : ");
		for (int i = 0; i < 6; i++) {
			selectNumber2[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber2[i] + " ");
		}
		System.out.println("");

		// ��÷��ȣ
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("��÷��ȣ : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println("");

		// ��÷����
		Arrays.sort(selectNumber2);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber2, winningNumber);
		if (result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		} else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}
}
