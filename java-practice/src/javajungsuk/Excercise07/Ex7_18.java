package javajungsuk.Excercise07;

// 💡 완벽해 난 짱이야
public class Ex7_18 {

    // 💡 Robot 클래스 또는 그 자손 클래스의 인스턴스일 것이라는 것만 알 수 있다.
    // 💡 instanceof 연산자를 이용해 실제 인스턴스의 타입을 확인한다.
    public static void action(Robot r){
        if(r instanceof DanceRobot){
            DanceRobot dr = (DanceRobot)r;
            dr.dance();
        }

        else if (r instanceof SingRobot){
            SingRobot sr = (SingRobot)r;
            sr.sing();
        }

        else if (r instanceof DrawRobot){
            DrawRobot dr = (DrawRobot)r;
            dr.draw();
        }
        else{
            return;
        }
    }

    public static void main(String[] args) {
        Robot[] arr = {
                new DanceRobot(),
                new SingRobot(),
                new DrawRobot()
        };
        for(Robot r : arr) {
            action(r);
        }
    }
}

class Robot{

}

class DanceRobot extends Robot{
    void dance(){
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot{
    void sing(){
        System.out.println("노래를 합니다.");
    }
}

class DrawRobot extends Robot{
    void draw(){
        System.out.println("그림을 그립니다.");
    }
}
