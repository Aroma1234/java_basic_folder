package basic;

public class LedExam {

	public static void main(String[] args) {
		
		TV tv = new LedTv();
		
		tv.turnOn();
		tv.changeVolume(0);
		tv.changeChannel(0);
		tv.turnOff();
	}

}
