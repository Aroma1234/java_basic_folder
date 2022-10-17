package day10_2nd;

public class ForTest2 {

	public static void main(String[] args) {
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<5-i; j=j+1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

