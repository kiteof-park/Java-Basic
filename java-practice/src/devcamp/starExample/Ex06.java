package devcamp.starExample;

public class Ex06 {
    public static void main(String[] args) {
        StringBuilder stars = new StringBuilder("*****");

        for(int i=0; i<5; i++){
            System.out.println(stars);
            stars.deleteCharAt(0);
        }


//        String star = "*";
//        for(int i = 5; i > 0; i--){
//            System.out.println(star.repeat(i));
//        }
    }
}
