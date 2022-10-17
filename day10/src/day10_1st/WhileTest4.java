package day10_1st;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int no;
		do {
			System.out.print("세자리 정수를 입력하세요: ");
			no = sc.nextInt();
		}while (no < 100 || no > 999);
		
		
		System.out.println("입력한 값은 " + no + "입니다.");

	}

}
