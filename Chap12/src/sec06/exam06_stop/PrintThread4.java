package sec06.exam06_stop;

public class PrintThread4 extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("���� ��");
			if (isInterrupted()) {
				break;
			}
		}

		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
