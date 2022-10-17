package inExam;

public class Sample {

	public static void main(String[] args) {
		
		
//		Dog dog = new Dog();
//		dog.setName("poppy");
//		
//		System.out.println(dog.name);
//		dog.sleep();
		
//		HouseDog houseDog = new HouseDog();
//		houseDog.setName("happy"); //Animal 즉, 할아버지의 기능
//		houseDog.sleep();          //Dog 즉, 아버지의 기능
//		houseDog.sleep(3);
		
		HouseDog houseDog1 = new HouseDog("happy");
		HouseDog houseDog2 = new HouseDog(1);
		
		System.out.println(houseDog1.name);
		System.out.println(houseDog2.name);


	}

}
