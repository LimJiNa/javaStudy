package sec02.exam03_abstract_method;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	public abstract void trunOn();

	void trunOff();

	void setVolume(int volume);
}
