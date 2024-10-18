package devcamp.starExample;

public class Ex02 {
    public static void main(String[] args) {
        String space = " ";

        for(int i=0; i<5; i++){
            System.out.print(space.repeat(i) + "*");
            System.out.println();
        }
    }
}
