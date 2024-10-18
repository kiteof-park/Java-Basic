package devcamp.arrayExample;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        /*
        * 예제 5-11 참고
        * 배열 arr을 읽어서 결과 출력 (별도로 작성)
        * 1. 중복 제거 -> 1 3 4 6 7 
        * 2. 정렬  -> 1 1 3 3 4 4 6 6 7 7 
        * */
        
        int[] arr = {4, 1, 3, 7, 6, 6, 3, 4, 1, 7, 7};

        // 1. 중복 제거
        
        // ArrayList로 생성
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            // 중복 검사 후 ArrayList에 추가
            if(!(arrList.contains(arr[i]))){
                arrList.add(arr[i]);
            }
        }

        // 출력
//        Arrays.sort(arrList.toArray());
        for(int num : arrList){
            System.out.print(num);
        }
        System.out.println();


//        System.out.print(arrList);      // 정렬해서 원소값만 깔끔하게 출력하고 싶은디

        // 2. 정렬
        Arrays.sort(arr);
//        Arrays.toString(arr);
        for(int num : arr){
            System.out.print(num);
        }
        System.out.println();
    }
}
