package javajungsuk.ch09;

class Person{
    long id;

    Person(long id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Person)){
            return false;
        }
//        Person p = (Person)obj;
//        return this.id == p.id;
        return id == ((Person)obj).id;
    }
}

public class Ex9_2 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(20);

        // 두 객체가 엄연히 다른 객체임을 확인하기위해 hashCode() 출력
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

        // 오버라이딩 된 equals()로 두 객체의 id값이 동일한지 확인
        // System.out.println(p1.equals(p2));
        if(p1.equals(p2))
            System.out.println("p1과 p2는 같은 사람입니다.");
        else
            System.out.println("p1과 p2는 다른 사람입니다.");

        System.out.println(p1.toString());
        System.out.println(p1);


    }
}
