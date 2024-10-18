package javajungsuk.ch06;

public class Ex6_12_ReferenceParam {
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,5,4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void printArr(int[] arr){
        // [3,2,1,6,5,4] 형태로 출력
        System.out.print("[");

        for(int num : arr){
            System.out.print(num + ", ");
        }
        System.out.println("]");

    }

    // 정렬
    static void sortArr(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length -1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    static int sumArr(int[] arr){
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        return sum;
    }
}
