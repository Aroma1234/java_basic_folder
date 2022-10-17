package day10_2nd;

import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("1부터 n까지의 합을 구합니다. n의 값 :");
		int num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			sum = sum + i;
		}
		System.out.println("1부터" + num + "까지의 합은" + sum + "입니다");
		

	}

}
