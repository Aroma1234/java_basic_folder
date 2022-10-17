package day10_1st;

public class WhilebreakExam {

	public static void main(String[] args) {
		int coffee = 100;
		int money = 300;
		
		while (true) {
			
			System.out.println("돈을 받아서 커피를 드립니다. ");
			coffee--; // coffee = coffee - 1, coffee -= 1
			System.out.println("님은 커피의 양은 " + coffee + "입니다. ");
			
			if (coffee == 0) {
				System.out.println("커피가 없습니다. 판매를 중지합니다. ");
				break;
			}
			
		}

	}

}
