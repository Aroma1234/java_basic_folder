package day10_1st;

import java.util.Scanner;

public class WhileTest6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		int a;
		do {
			System.out.print("양의 정수값 :");
			a = sc.nextInt();
			
		}while(a <= 0);
			
		while(a >= 0) {
			System.out.println(a);
			a--;
			
		}
		
		System.out.println("X의 값이 " + a + "이 됐습니다.");

	}

}
