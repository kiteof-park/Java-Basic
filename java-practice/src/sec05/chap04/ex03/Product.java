package sec05.chap04.ex03;

public class Product {
    // 필드는 모두 private

    private static double discout = 0.2;
    private static double increaseLimit = 1.2;

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 외부에서 필드를 사용/접근/변경하기 위해 getter/setter 메소드
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) return;
        this.name = name;
    }

    public int getPrice() {
        return (int)(price * (1-discout));
    }

    public void setPrice(int price) {
        int max = (int) (this.price * increaseLimit);
        this.price = price < max ? price : max;
    }
}
