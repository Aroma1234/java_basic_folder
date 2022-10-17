package day9_2nd;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		

		if(number % 2 == 1) {
			System.out.println("odd number");
		} else {
			System.out.println("even number");
		}
		
		sc.close();



	}

}
