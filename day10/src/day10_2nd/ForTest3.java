package day10_2nd;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("카운트 업 합니다");
		System.out.print("양의 정수값: ");
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			System.out.println(i);
		}

	}

}
