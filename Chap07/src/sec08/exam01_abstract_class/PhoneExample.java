package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동"); 직접 객체 생성 X, 자식클래스를 이용해서 객체 생성O

		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
