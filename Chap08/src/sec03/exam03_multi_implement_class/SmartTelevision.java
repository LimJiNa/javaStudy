package sec03.exam03_multi_implement_class;

public class SmartTelevision implements RemoteControl, Searchable {
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

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}
