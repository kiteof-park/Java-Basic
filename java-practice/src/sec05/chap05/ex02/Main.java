package sec05.chap05.ex02;

public class Main {
    public static void main(String[] args) {
        Button entrButton = new Button("Enter");
        ShutDownButton stdnButton = new ShutDownButton();
        ToggleButton tglButton = new ToggleButton("CapsLock", false);

        // Button.func()
        entrButton.func();
        System.out.println("\n- - - - -\n");

        // ShutDown.func()
        stdnButton.func();
        System.out.println("\n- - - - -\n");

        // ToggleButton.func()
        tglButton.func();
        tglButton.func();
        tglButton.func();
    }

}
