package sec07.exam03_field_polymorphism;

public class Tire {
	// 타이어의 최대 회전수
	public int maxRotation;

	// 타이어의 누적 회전수
	public int accumulatedRotation;

	// 타이어의 위치
	public String location;

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("**** " + location + " Tire 펑크 ****");
			return false;
		}
	}
}
