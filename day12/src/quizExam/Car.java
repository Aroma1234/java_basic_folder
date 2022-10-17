package quizExam;

public class Car {
	
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	public Car(String name, int width, int height, int length, double x, double y, double fuel) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = x;
		this.y = y;
		this.fuel = fuel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	
	//자동차 사양 표시 메서드
	public void putSpec() {
		System.out.println("이름 : + name");
		System.out.println("전폭 : + name");
		System.out.println("전고 : + name");
		System.out.println("전장 : + name");
	}
	
	

}
