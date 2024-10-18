package devcamp.starExample;

public class Ex08 {
    public static void main(String[] args) {
        StringBuilder stars = new StringBuilder("*");
        StringBuilder space = new StringBuilder("     ");

        for(int i=0; i<5; i++){
            System.out.printf("%s%s%n", space, stars);
            space.deleteCharAt(0);
            stars.append("**");
        }
    }
}
