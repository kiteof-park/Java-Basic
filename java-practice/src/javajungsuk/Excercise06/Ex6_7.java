package javajungsuk.Excercise06;

class MyPoint{
    int x;
    int y;

    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x2, int y2){
        return Math.sqrt(Math.pow((x2-x),2) + Math.pow((y2-y),2));
    }
}


public class Ex6_7 {
    public static void main(String[] args) {
        MyPoint mp = new MyPoint(1,1);
        System.out.println(mp.getDistance(2,2));

    }
}
