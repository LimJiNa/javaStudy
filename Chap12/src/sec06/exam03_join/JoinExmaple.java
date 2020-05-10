package sec06.exam03_join;

public class JoinExmaple {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("1~100 гу: " + sumThread.getSum());
	}
}
