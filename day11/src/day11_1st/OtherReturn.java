package day11_1st;

public class OtherReturn {
	void sayNick(String nick) {
		if("fool".equals(nick)) {
			return;  //이 return은 빠져나가는 용도. break와 유사함
		}
		System.out.println("나의 별명은 " +nick+ "입니다.");
	}

	public static void main(String[] args) {
		OtherReturn sample = new OtherReturn();
		sample.sayNick("홍길동");
		sample.sayNick("fool");
		sample.sayNick("제이름");

	}

}


