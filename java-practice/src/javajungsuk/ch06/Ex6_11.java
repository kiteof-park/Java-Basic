package javajungsuk.ch06;

class DataClass1{
    int value;
}

class DataClass2{
    int value;

    DataClass2(int value){ this.value = value; }


}

public class Ex6_11 {
    public static void main(String[] args) {
        DataClass1 d1 = new DataClass1();
        DataClass2 d2 = new DataClass2(10);

    }
}
