package sec04.chap04;

public class Ex03 {
    public static void main(String[] args) {
//        int enemies = 0;
//
//        System.out.println("일단 사격");
//
//        do{
//            System.out.println("탕");
//            if(enemies > 0) enemies--;
//        } while(enemies>0);
//
//        System.out.println("사격 중지 아군이다.");

        int x = 11;
        int y = x;

        while(x < 10){
            System.out.println("while문: "+ x++);
        }

        do{
            System.out.println("do..while문: "+y++);
        }while(y<10);
    }
}
