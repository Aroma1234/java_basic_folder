package day10_2nd;

public class ForTest1 {

	public static void main(String[] args) {
		for(int i=0; i<5; i=i+1) {
			for(int j=0; j<i+1; j=j+1) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


