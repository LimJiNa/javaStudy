package sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };

	public static int maxOrmin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// �ִ밪
		int max = maxOrmin((a, b) -> {
			if (a >= b) {
				return a;
			} else {
				return b;
			}
		});
		System.out.println("�ִ밪: " + max);

		// �ּҰ�
		int min = maxOrmin((a, b) -> {
			if (a >= b) {
				return b;
			} else {
				return a;
			}
		});
		System.out.println("�ּҰ�: " + min);
	}
}
