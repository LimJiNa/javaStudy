package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + thread.getName());

		Thread threadA = new ThreadA();
		System.out.println("ThreadA를 생성한 스레드: " + threadA.currentThread().getName());
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();

		Thread threadB = new ThreadB();
		System.out.println("ThreadB를 생성한 스레드: " + threadB.currentThread().getName());
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
