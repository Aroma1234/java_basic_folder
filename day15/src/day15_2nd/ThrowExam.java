package day15_2nd;

public class ThrowExam {

	
	public void sayNick(String nick) {
		if("fool".equals(nick)) {
			throw new FoolException();
		}
		System.out.println("당신의 별명은 " + nick + "입니다.");
	}
	
	public static void main(String[] args) {
		ThrowExam sample = new ThrowExam();
		sample.sayNick("fool");
		sample.sayNick("genius");
	}
}
