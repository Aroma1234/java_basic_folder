package day10_2nd;

public class ForExam4 {

	public static void main(String[] args) {
		
		int[] score = {90, 80, 90, 100, 70};
		
		for (int i = 0; i < score.length ; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		
		for (int j : score) {
			System.out.print(j + " ");
		}

	}

}
