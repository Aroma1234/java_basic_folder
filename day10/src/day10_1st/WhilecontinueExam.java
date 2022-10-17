package day10_1st;

public class WhilecontinueExam {

	public static void main(String[] args) {
		int a = 0;
		
		while(true) {
			a++;
			
			if (a % 2 == 0) {
				continue; // 짝수인 경우 다시 while로 들어간다
			}
			
			System.out.println(a); // 홀수만 무한 출력하게 된다
		}
	}

}
