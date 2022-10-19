package basic;

public class MycalTest {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		
		cal.plus(3, 4);
		int x = cal.exec(5, 6);
		System.out.println(x);
		
		Calculator.exec2(3, 4);

	}

}
