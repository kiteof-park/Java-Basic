package sec05.chap02.ex02;

public class IntArrayInfo {

    // 원시값이 초기화 안된 경우, 가장 작은 값으로 초기화
    int count, max, min, sum;
    double average;

    // 생성자
    IntArrayInfo(int nums[]){
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num;
        }

        // sum/count는 정수를 반환하므로 1.0을 곱해 실수와 정수의 연산으로 만듦
        // 실수와 정수의 연산은 실수를 반환
        average = 1.0 * sum/count;
    }
}
