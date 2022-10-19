package interfaceExam;

public interface Predator {
	
	String getFood();
	
	String getSomething();
	
	default void printFood() {
		System.out.printf("my food is %s" , getFood());
	}

}
