package day11_1st;

public class MethodV {
	
	int varTest(int a) {

		return ++a;
	}

	public static void main(String[] args) {
		int a = 1;
		MethodV sample = new MethodV();
		a = sample.varTest(a);
		System.out.println(a);

	}

}
