package sec08.exam01_abstract_class;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone("ȫ�浿"); ���� ��ü ���� X, �ڽ�Ŭ������ �̿��ؼ� ��ü ����O

		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}