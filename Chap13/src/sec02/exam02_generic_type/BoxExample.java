package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();

		box1.set("hello");
		String greet = box1.get();
		System.out.println(greet);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(7);
		int value = box2.get();
		System.out.println(value);
	}
}
