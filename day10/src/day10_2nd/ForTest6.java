package day10_2nd;

import java.util.Scanner;

public class ForTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다");
		System.out.print("단수는?: ");
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
