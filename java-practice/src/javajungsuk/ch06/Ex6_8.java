package javajungsuk.ch06;

class Data3 { int x;}

public class Ex6_8 {
    public static void main(String[] args) {
        Data3 data = new Data3();
        data.x = 10;

        Data3 dataCopy = copy(data);
        System.out.println("data.x = " + data.x);
        System.out.println("dataCopy.x = " + dataCopy.x);
    }

    // 참조형 반환 타입 - 객체의 주소(참조값)을 반환
    static Data3 copy(Data3 data){
        // 새로운 객체 tmp 생성
        Data3 tmp = new Data3();

        // 새로운 객체 tmp의 필드 tmp.x에 data.x의 값을 복사
        tmp.x = data.x;

        // 복사한 객체의 주소를 반환 (tmp 객체 반환 -> tmp 객체의 주소 반환)
        return tmp;
    }
}
