package sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;
	//public int field = 10;

	class Inner {
		int innerField = 20;
		//int field = 20;

		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				System.out.println("innerField: " + innerField);
				//System.out.println("outterField: " + UsingThis.this.field);
				//System.out.println("innerField: " + this.field);
			};
			fi.method();
		}
	}
}
