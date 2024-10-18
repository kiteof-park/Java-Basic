package sec06.chap03.ex02;

public class YalcoChicken {
    private String name;

    public YalcoChicken(String name){
        this.name = name;
    }

    // static 내부 클래스
    public static class LaunchTF {
        private String title;
        private String leader;

        // static 내부 클래스의 생성자
        public LaunchTF(String title, String leader) {
            this.title = title;
            this.leader = leader;
        }

        // static 내부 클래스의 메서드
        public YalcoChicken launch() {
            // staitc 내부 클래스 -> Outer의 인스턴스 필드 사용 불가
            // System.out.println(this.name);
            return new YalcoChicken(title);
        }
    }

    // instance 내부 클래스
    class Gift{
        private String message;
        public Gift(String to){
            this.message = "From 얄코치킨 %s점 to %s님"
                    .formatted(name, to);
        }
    }

    // 외부 클래스의 인스턴스 메서드
    // instance 내부 클래스의 인스턴스를 반환하는 메서드
    public Gift getGift(String to){
        return new Gift(to);
    }
}

