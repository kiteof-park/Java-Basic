package hon_gong_java.sec03.exma02;

public class AnimalExample {
    public static void main(String[] args) {
//        Animal[] animals = {
//                new Dog("진돗개"),
//                new Cat("코리안 숏")
//        };
//
//        for(Animal animal : animals){
//            animal.sound();
//        }

        Dog dog = new Dog("진돗개");
        Cat cat = new Cat("코리안 숏");
        dog.sound();
        cat.sound();

        System.out.println("------------");

        // 자동 타입 변환, 재정의된 메소드 호출 - 다형성
        Animal animal = null;
        animal = new Dog("리트리버");
        animal.sound();
        animal = new Cat("러시안 블루");
        animal.sound();

        System.out.println("------------");

        // 메소드 호출 - 메소드 다형성
        animalSound(dog);
        animalSound(cat);
    }

    // 매개값을 받아오면서 자동 타입 변환
    public static void animalSound(Animal animal){
        // 재정의된 메소드 호출
        animal.sound();
    }
}
