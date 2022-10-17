package day11_1st;

public class MethodTypeExam {
	
	//1. 입출력이 모두 있는 매서드
		int inputout(int a, int b) {
			return a*b;
		}
		
	//2. 입출력이 모두 없는 매서드
		void noinout() {
			System.out.println("환영합니다.");
		}
		
	//3. 입력은 없고 출력은 있는 매서드
		String noinput() {
			return "어서오세요";
		}
		
	//4. 입력은 있고 출력은 없는 매서드
		void yesinput(String name) {
			System.out.println(name + "님 환영합니다.");
		}
		
	public static void main(String[] args) {
		MethodTypeExam test = new MethodTypeExam();
		
		//1. 입출력이 모두 있는 매서드
		System.out.println(test.inputout(2, 3));
		
		//2. 입출력이 모두 없는 매서드
		test.noinout();
		
		//3. 입력은 없고 출력은 있는 매서드
		System.out.println(test.noinput());
		
		//4. 입력은 있고 출력은 없는 매서드
		test.yesinput("홍길동");
	}

}
