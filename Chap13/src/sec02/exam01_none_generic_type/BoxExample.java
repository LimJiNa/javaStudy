package sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();

		box.set("ȫ�浿");

		String name = (String) box.get();
		System.out.println(name);

		box.set(new Apple());
		String apple = (String) box.get();
	}
}
