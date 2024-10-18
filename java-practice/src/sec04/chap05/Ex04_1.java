package sec04.chap05;

public class Ex04_1 {

    static int[] getMaxMin(int[] nums){
        int max = nums[0];
        int min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
        }

        return new int[] {max, min};
    }

    public static void main(String[] args) {

        int[] numbers = {5,6,7,8,11};

        int maxOfnumbers = getMaxMin(numbers)[0];
        int minOfnumbers = getMaxMin(numbers)[1];

    }
}
