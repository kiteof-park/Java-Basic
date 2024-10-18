package javajungsuk.ch06;

class Document{
    static int count = 0;
    String name;

    Document(){
        this("제목없음"+ ++count);
    }

    Document(String name){
        this.name = name;
        System.out.printf("%s.txt가 생성되었습니다.%n", name);
    }
}

public class Ex6_30_DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("박의연짱");
        Document d3 = new Document();
    }
}
