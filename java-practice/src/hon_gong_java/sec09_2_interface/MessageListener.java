package hon_gong_java.sec09_2_interface;

public class MessageListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
