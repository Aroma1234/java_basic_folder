package interfaceExam;

public interface Predator {
	
	String getFood();
	
	default void printFood() {
		System.out.printf("my food is %s" , getFood());
	}

}
