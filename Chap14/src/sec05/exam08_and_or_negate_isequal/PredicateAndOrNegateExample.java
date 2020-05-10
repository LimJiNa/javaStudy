package sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		// 2�� ��� �˻�
		IntPredicate predicateA = (a) -> {
			return a % 2 == 0;
		};

		// 3�� ��� �˻�
		IntPredicate predicateB = (a) -> {
			return a % 2 == 1;
		};

		IntPredicate predicateAB;
		boolean result;

		// and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		if (result == false) {
			System.out.println(result + " Ȧ���Դϴ�.");
		} else {
			System.out.println(result + " ¦���Դϴ�.");
		}

		// or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����Դϱ�? " + result);

		// negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���Դϱ�? " + result);
	}
}
