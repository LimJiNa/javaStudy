package sec07.exam03_field_polymorphism;

public class Tire {
	// Ÿ�̾��� �ִ� ȸ����
	public int maxRotation;

	// Ÿ�̾��� ���� ȸ����
	public int accumulatedRotation;

	// Ÿ�̾��� ��ġ
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("**** " + location + " Tire ��ũ ****");
			return false;
		}
	}
}
