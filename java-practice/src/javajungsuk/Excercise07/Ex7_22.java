package javajungsuk.Excercise07;

//abstract class Shape{
//    Point p;
//
//    Shape(){ this(new Point(0,0)); }
//    Shape(Point p){ this.p = p; }
//
//    abstract double calcArea();     // 면적 계산 메서드
//
//    Point getPosition(){
//        return p;
//    }
//
//    void setPosition(Point p){
//        this.p = p;
//    }
//
//}
//
//class Point{
//    int x;
//    int y;
//
//    Point(){ this(0,0); }
//    Point(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//
//    public String toString(){
//        return "%d, %d".formatted(x, y);
//    }
//}
//
//class Circle extends Shape{
//    double r;
//
//    Circle(){}
//
//    Circle(double r){ this.r = r; }
//
//    @Override
//    double calcArea() {
//        return r * r * Math.PI;
//    }
//}
//
//class Rectangle extends Shape{
//    double width;
//    double height;
//
//    Rectangle(){}
//    Rectangle(double width, double height){
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    double calcArea() {
//        return width * height;
//    }
//
//    boolean isSquare(){
//        return width == height;
//    }
//}
//
//public class Ex7_22 {
//
//    // 주어진 배열에 담긴 도형들의 넓이를 모두 너해서 반환
//    public static double sumArea(Shape[] arr){
//        double sum = 0;
//        for(Shape shape : arr){
//            sum += shape.calcArea();
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Shape[] arr = {
//                new Circle(5.0),
//                new Rectangle(3, 4),
//                new Circle(1)
//        };
//        System.out.println("면적의 합: " + sumArea(arr));
//
//    }
//}
