package sec11.exam01_final;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");

		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);

//		p1.nation = "USA"; -> final이라 X
//		p1.ssn = "654321-7654321"; -> final이라 X
	}
}
