package sec03.exam01_name_implement_class;

public class Television implements RemoteControl {
	private int volume;

	@Override
	public void trunOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void trunOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}
}
