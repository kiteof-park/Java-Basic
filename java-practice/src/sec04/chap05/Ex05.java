package sec04.chap05;

public class Ex05 {

    static double getAverage(int... nums){
        double result = 0.0;
        for (int num : nums){
            result += num;
        }
        return result / nums.length;
    }

    public static void main(String[] args) {

        double avg = getAverage(31, 91, 14, 27, 4);
        double avgArry = getAverage(new int[] {31, 91, 14, 27, 4});

    }
}
