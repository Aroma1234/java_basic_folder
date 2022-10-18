package polyExam;

public class Sample {

	public static void main(String[] args) {
		// 동물원...
		
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		Bouncer bouncer = new Bouncer();
		
		bouncer.barkAnimal(lion);
	}

}
