package inExam;

public class HouseDog extends Dog{
		
		//생성자
		HouseDog(String name){
			this.setName(name);
		}
		
		HouseDog() {
			
		}
		
		HouseDog(int type) {
			if (type ==1) {
				this.setName("yorkshire");
			}else if (type ==2)
				this.setName("bulldog");
			
		}

	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house " + hour + "hours");
	}
}
