package day10_1st;

public class WhileTest {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while (i < 1000) {
			i++;
			if (i % 3 == 0) {
				sum = sum + i;
			}
			
			
			System.out.println("1000까지의 배수의 합 = " + sum );

		}

	}
}