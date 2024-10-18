package sec05.chap04.ex03;

public class Main {
    public static void main(String[] args) {

        Product ballpen = new Product("볼펜", 1500);

        ballpen.setName("피자볼펜");
        ballpen.setName("");

        int ballPenPrice = ballpen.getPrice();

        ballpen.setPrice(2000);
    }
}
