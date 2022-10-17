package day10_1st;

import java.util.Scanner;

public class WhileTest7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?: ");
		int a = sc.nextInt();
		
		while (a > 0) {
			System.out.print("*");
			a = a - 1;
		}
		System.out.println();
		System.out.println("줄바꿈 확인");
		
		
		

	}

}
