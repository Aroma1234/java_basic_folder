package day10_2nd;

import java.util.Scanner;

public class ForTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드를 표시합니다.");
		System.out.print("단수는?: ");
		int num = sc.nextInt();

		for (int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");		
			}
			System.out.println();
		}

	}

}