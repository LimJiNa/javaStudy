package sec05.exam02_final_method;

public class Car {
	public int speed;

	public void speedUp() {
		speed++;
	}

	public final void stop() {
		System.out.println("�ڸ� ����");
		speed = 0;
	}
}
