package day11_1st;

class cats {
    
    String nam;
    
    public void setName(String name) {
        this.nam = name;
    }
}

public class Practice123 {

    public static void main(String[] args) {
        cats cat = new cats();
        cat.setName("asdf");
        System.out.println(cat.nam);

    }

}
