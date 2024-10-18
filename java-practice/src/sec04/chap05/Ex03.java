package sec04.chap05;

public class Ex03 {
    static int count = 0;

    static int getCount(){
        System.out.println("카운트 증가");
        return ++count;
    }

    public static void main(String[] args) {
        int count1 = getCount();
        int count2 = getCount();
        int count3 = getCount();
        int count4 = getCount();

    }
}
