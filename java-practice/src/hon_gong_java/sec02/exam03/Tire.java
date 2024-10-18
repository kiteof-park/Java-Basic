package hon_gong_java.sec02.exam03;

public class Tire {

    // 필드
    public int maxRotation;         // 최대 회전수 (타이어 수명)
    public int accumulatedRotation; // 누적 회전수
    public String location;         // 타이어의 위치

    // 생성자
    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }

    // 메소드
    public boolean roll(){
        ++accumulatedRotation;      // 누적 회전수 1증가
        if(accumulatedRotation < maxRotation){  // 누적 회전수가 최대 회적수보다 적다면
            System.out.println(location + " Trie 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        }
        else {
            System.out.println("*** " + location +"Tire 펑크 ***");
            return false;
        }
    }
}
