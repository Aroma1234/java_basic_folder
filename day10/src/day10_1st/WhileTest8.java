package day10_1st;

import java.util.Scanner;

public class WhileTest8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요?: ");
		int a = sc.nextInt();
		do {
			if(a % 2 == 1) {
				System.out.print("*");
			}else {
				System.out.print("+");
			}
		
		a--;		
	
		}while(a > 0);
		
	  }

}


