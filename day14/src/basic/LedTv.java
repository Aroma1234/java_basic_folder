package basic;

public class LedTv implements TV{
	
	public void turnOn() {
		System.out.println("켜다");
	}
	public void turnOff() {
		System.out.println("끄다");
	}
	public void changeVolume(int volume) {
		System.out.println("볼륨을 조절하다");
	}
	public void changeChannel(int channel) {
		System.out.println("채널을 변경하다");
	}
}
