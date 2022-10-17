package day11_1st;


class Animal {
	
	String name;  // 객체변수, 인스턴스변수, 멤버변수
	
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Sample1 {

	public static void main(String[] args) {
		Animal cat = new Animal();
		//new는 새로운 객체로 생성할 때 사용하는 키워드
		//cat 인스턴스는 Animal 클래스로 만들었다.
		System.out.println(cat.name);
		cat.setName("boby");
		System.out.println(cat.name);
		System.out.println();
		Animal dog = new Animal();
		System.out.println(dog.name);
		dog.setName("honey");
		System.out.println(dog.name);

	}

}
