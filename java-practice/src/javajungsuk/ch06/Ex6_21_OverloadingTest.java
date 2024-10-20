package javajungsuk.ch06;

public class Ex6_21_OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3,3)결과 : " + mm.add(3,3));
        System.out.println("mm.add(3,3L)결과 : " + mm.add(3,3L));
        System.out.println("mm.add(3L,3)결과 : " + mm.add(3L,3));
        System.out.println("mm.add(int[] arr)결과 : " + mm.add(new int[]{1,2,3,4,5}));
    }
}

class MyMath3{
    int add(int a, int b){
        System.out.print("int add(int a, int b)- ");
        return a + b;
    }

    long add(int a, long b){
        System.out.print("long add(int a, long b)- ");
        return a + b;
    }

    long add(long a, int b){
        System.out.print("long add(long a, int b)- ");
        return a + b;
    }

    long add(long a, long b){
        System.out.print("long add(long a, long b)- ");
        return a + b;
    }

    int add(int[] arr){
        System.out.print("int add(int[] arr)- ");
        int result = 0;
        for(int num : arr){
            result += num;
        }
        return result;
    }

}