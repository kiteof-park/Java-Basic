package sec04.chap06;

public class Ex02 {

    static void modifyIntArg (int num) {
        System.out.printf("수정 전: %d%n", num++);
        System.out.printf("수정 후: %d%n", num);
    }

    static  void modifyAryElem (int[] ary) {
        System.out.printf("수정 전: %d%n", ary[1]++);
        System.out.printf("수정 후: %d%n", ary[1]);
    }

    public static void main(String[] args) {
        int intNum = 3;
        System.out.println("원시 자료형");
        modifyIntArg(intNum);

        System.out.println();

        int[] intNums = {1, 2, 3};

        //  배열은 참조형이지만 그 안의 값들은 원시형
        System.out.println("참조 자료형 배열의 원소값");
        modifyIntArg(intNums[0]);

        System.out.println();
        //  참조형인 배열 자체를 인자로 사용
        System.out.println("참조 자료형");
        modifyAryElem(intNums);

    }
}
