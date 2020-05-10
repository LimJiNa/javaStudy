package sec13.exam02_random;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		// 선택번호
		int[] selectNumber1 = new int[6];
		Random random = new Random();
		System.out.print("선택번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber1[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber1[i] + " ");
		}
		System.out.println("");

		int[] selectNumber2 = new int[6];
		random = new Random(5);
		System.out.print("선택번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber2[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber2[i] + " ");
		}
		System.out.println("");

		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println("");

		// 당첨여부
		Arrays.sort(selectNumber2);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber2, winningNumber);
		if (result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
