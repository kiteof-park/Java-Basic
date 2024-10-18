package javajungsuk.Excercise06;

import java.util.Arrays;



public class Ex6_20 {

    // 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
    // Math.random()을 사용하는 경우 실행 결과와 다를 수 있음(?)
    public static int[] shuffle(int[] arr){
//        // arr과 동일한 길이의 새로운 배열 생성
//        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            // random한 숫자가 0 ~ 8 까지의 값을 갖도록 함
            int random = (int)(Math.random()*10 -1);

//            int tmp = arr[random];
//            arr[random] = arr[0];
//            arr[0] = tmp;

            int tmp = arr[0];
            arr[0] = arr[random];
            arr[random] = tmp;


        }

        return arr;
    }


    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
