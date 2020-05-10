package sec02.exam04_default_method;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	public abstract void trunOn();

	void trunOff();

	void setVolume(int volume);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
