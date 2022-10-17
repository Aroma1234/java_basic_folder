package day11_1st;

	class MyClass {
	int myMethod(int value) {
		return value+1;
	}
}


public class Practice {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println(mc.myMethod(10));
		System.out.println(mc.myMethod(20));

	}

}
