package hon_gong_java.sec05;

public class Main {
    public static void main(String[] args) {
        CoffeeType myCoffee = CoffeeType.LATTE;

        System.out.println("My coffee is " + myCoffee.name() + "and its ordinal is " + myCoffee.ordinal() );

        for(CoffeeType coffee : CoffeeType.values()){
            System.out.println(coffee.name() + " has " + coffee.getCaffeine() + "mg of caffeine");
        }
    }
}
