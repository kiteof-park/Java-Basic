package hon_gong_java.sec09;

public class CheckBoxExample {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();

        checkBox.setListener(new BackgroundChangeListener());
        checkBox.select();


    }
}
