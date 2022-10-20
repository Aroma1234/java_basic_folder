package day15_2nd;

public class ThrowsExam {


	public void sayNick(String nick) throws FoolException {

//		try {
			if("fool".equals(nick)) {
				throw new FoolException();
			}
			System.out.println("당신의 별명은 " + nick + "입니다.");
//		} catch(FoolException e) {
//			System.out.println("FoolException 발생");
//		}
	}	

	public static void main(String[] args) {
		ThrowsExam sample = new ThrowsExam();
		
		try {
		sample.sayNick("fool");
		sample.sayNick("genius");
		} catch (FoolException e) {
			System.out.println("FoolException 발생");
		}
	}
}
