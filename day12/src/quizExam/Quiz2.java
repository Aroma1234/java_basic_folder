package quizExam;

public class Quiz2 {

	public static void main(String[] args) {
		
		Sonata grandeur = new Sonata("asdf", 4000, 5000, 6000, 3.2, 4.5, 50.5);
		
		grandeur.setTotalMileage(20);
		
		System.out.println("그랜져 모델명 :" + grandeur.getName());
		System.out.println("그랜져 사양 :" + grandeur.getWidth() + " " + grandeur.getHeight() + " " + grandeur.getLength());
		System.out.println("그랜져 마일리지 :" + grandeur.getTotalMileage());
	}

}

