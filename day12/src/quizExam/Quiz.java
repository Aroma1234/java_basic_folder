package quizExam;

public class Quiz {

	public static void main(String[] args) {

		Sonata sonata = new Sonata("SM5", 3000, 5000, 7000, 1.2, 2.3, 60.0);
		
		sonata.setTotalMileage(10);
		
		System.out.println("소나타 모델명 :" + sonata.getName());
		System.out.println("소나타 사양 :" + sonata.getWidth() + " " 
		+ sonata.getHeight() 
		+ " " + sonata.getLength());
		System.out.println("소나타 마일리지 :" + sonata.getTotalMileage());

	}

}
