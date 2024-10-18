package sec04.chap05;

public class Ex04 {
    static double getAverage(int[] nums){
        double sum = 0;

        for (int num: nums) {
            sum += num;
        }
        return sum / nums.length;
    }

    public static void main(String[] args) {
        double avg= getAverage(new int[] {3, 5, 7, 9, 11});

    }
}
