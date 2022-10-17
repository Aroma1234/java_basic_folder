package day10_2nd;

public class ForExam {

	public static void main(String[] args) {


//		for (int i = 0 ; i <= 10 ; i++); {
//			System.out.println("Hi" + i);
//		}
		
//		String[] numbers = {"one", "two", "three"};
//		
//		for(int i = 0; i <= 2; i++) {
//		System.out.println(numbers[i]);
		
		int[] score = {90, 80, 90, 100, 70};
		
		int sum = 0, avg = 0;
		
		for (int i = 0; i < score.length ; i++) {
			sum = sum + score[i];
		}
		System.out.println("총 합계 점수: " + sum);
		System.out.println("총 평균 점수: " + (sum/5));
			
		
		
		
		
		}
		

	}


