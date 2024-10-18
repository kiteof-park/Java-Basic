package sec05.chap06.ex01;

public class YalcoChickenDT extends YalcoChicken {
    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name, boolean driveThruOpen) {
        super(no, name);
        this.driveThruOpen = driveThruOpen;
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder(){
        System.out.printf(
                "%d호 %s점 드라이브 스루 주문 %s%n", no, name,
                (driveThruOpen ? "받음" : "불가")
        );
    }
}
