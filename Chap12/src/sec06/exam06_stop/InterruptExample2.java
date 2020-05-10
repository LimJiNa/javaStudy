package sec06.exam06_stop;

public class InterruptExample2 {
	public static void main(String[] args) {
		PrintThread2 printThread = new PrintThread2();

		printThread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		printThread.interrupt();
	}
}
