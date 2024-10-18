package javajungsuk.ch06;

class Product{
    static int count = 0;
    int serialNo;

//    Product(){
//        serialNo = ++count;
//    }

    {
        count++;
        serialNo = count;
    }

    public String toString(){
        return "제품번호(serial no)는 %d입니다.".formatted(serialNo);
    }
}


public class Ex6_29_ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1의 " + p1);
        System.out.println("p2의 " + p2);
        System.out.println("p3의 " + p3);
    }
}
