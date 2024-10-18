package sec03.chap07;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "%s(은)는 키: %f cm, 몸무게: %d입니다";

        String name = "박의연";
        double height = 163.0f;
        int weight = 65;

        String profile1 = str1.formatted(name, height, weight);
        String profile2 = String.format(str1, name, height, weight);

        System.out.printf("%s(은)는 키: %f cm, 몸무게: %d입니다. %n", name, height, weight);
        System.out.printf((str1) + "%n", name, height, weight);
        System.out.println(str1.formatted(name, height, weight));


    }
}
