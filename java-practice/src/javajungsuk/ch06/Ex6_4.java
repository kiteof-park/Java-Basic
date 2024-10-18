package javajungsuk.ch06;
//
//public class Ex6_4 {
//    public static void main(String[] args) {
//        MyMath mm = new MyMath();
//        long resultAdd = mm.add(5L, 3L);
//        long resultSub = mm.substract(5L, 3L);
//        long reusltMul = mm.multiply(5L, 3L);
//        double resultDiv = mm.divide(5L, 3L);
//        long resultMax = mm.max(5, 3);
//
//        System.out.println("add(5L, 3L) = " + resultAdd);
//        System.out.println("substract(5L, 3L) = " + resultSub);
//        System.out.println("multiply(5L, 3L) = " + reusltMul);
//        System.out.println("divide(5L, 3L) = " + resultDiv);
//        System.out.println("max(5, 3) = " + resultMax);
//        mm.printGugudan(12);
//    }
//}
//
//class MyMath{
//    // + - * /
//    long add(long a, long b){
//        return a + b;
//    }
//
//    long substract(long a, long b){
//        return a - b;
//    }
//
//    long multiply(long a, long b){
//        return a * b;
//    }
//
//    double divide(long a, long b){
//        return (double)a / b;
//    }
//
//    // 두 값을 받아서 둘 중에 큰 값을 반환하는 메서드 작성
////    long max(long a, long b){ return a > b ? a : b; }
//
//    long max (long a, long b){
//        if( a > b ){
//            return a;
//        }
//        else
//            return b;
//    }
//
//    // 구구단 메서드
//    void printGugudan(int dan){
//        if(!(2<=dan && dan <=9)){
//            return;
//        }
//        for(int i=1; i<=9; i++){
//            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
//        }
//    }
//
//
//
//}
