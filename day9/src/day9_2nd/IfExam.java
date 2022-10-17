package day9_2nd;

public class IfExam {

	public static void main(String[] args) {
		
		int money = 500;
		boolean card = true;
		
		if (money >= 1000) {
			System.out.println("버스 타자");
		} else if(money >= 5000) {
			System.out.println("택시 타자");	
		} else {
			System.out.println("걸어 가자");
		}

	}

}
