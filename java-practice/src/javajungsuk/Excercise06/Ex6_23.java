package javajungsuk.Excercise06;

import java.util.Arrays;

public class Ex6_23 {
    public static int max(int[] arr){
        // if(arr.length == 0 || arr == null) 일때 오류나는 이유는?
        if(arr == null || arr.length == 0){
            return -999999;
        }

        int max = arr[0];

        // for문의 인덱스를 1로 시작 -> max값은 arr[0]이므로 0부터 비교할 이유가 없다.
        for(int i = 1; i < arr.length; i++){
            max = (arr[i] > max ? arr[i] : max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(new int[]{123,446,7,399,34,9999}));
        System.out.println("최대값 : " + max(null));       // null
        System.out.println("최대값 : " + max(new int[]{}));    // 크기가 0인 배열

    }
}
