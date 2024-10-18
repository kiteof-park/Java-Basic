package javajungsuk.Excercise06;

public class Ex6_6 {
    // 두 점 (x1, y1), (x2, y2) 사이의 거리
    // d = 루트( (x2 - x1)^2 + (y2 -y1)^2 )
    static double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
