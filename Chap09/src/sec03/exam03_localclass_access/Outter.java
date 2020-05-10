package sec03.exam03_localclass_access;

public class Outter {
	// 자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}

	// 자바 8이후
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 10;
		class Inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
