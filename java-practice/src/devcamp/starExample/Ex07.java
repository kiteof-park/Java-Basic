package devcamp.starExample;

public class Ex07 {
    public static void main(String[] args) {
        StringBuilder stars= new StringBuilder("*****");

        for(int i=0; i<5; i++){
            System.out.println(stars);
            stars.append("*");
        }
    }
}
