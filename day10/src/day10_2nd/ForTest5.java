package day10_2nd;

import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정방형을 표시합니다.");
		System.out.print("단수는: ");
		int num = sc.nextInt();
		
		for (int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
