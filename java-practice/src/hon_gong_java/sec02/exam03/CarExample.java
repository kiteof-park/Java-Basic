package hon_gong_java.sec02.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        // 5번 회전했을 때, 가장 먼저 펑크나는 타이어 찾기
        for(int i = 1; i <=5; i++){
            int problemLocation = car.run();

            // 1회 반복마다 펑크난 타이어가 있나 확인
            switch(problemLocation){
                case 1:
                    System.out.println("앞 왼쪽 HankookTire로 교체");
                    car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
                    break;
                case 2:
                    System.out.println("앞 오른쪽 KumhoTire로 교체");
                    car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤 왼쪽 HankookTire로 교체");
                    car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
                    break;
                case 4:
                    System.out.println("뒤 오른쪽 KumhoTire로 교체");
                    car.backLeftTire = new KumhoTire("뒤 오른쪽", 17);
                    break;
            }
            System.out.println("-----------------------------");
        }
    }
}
