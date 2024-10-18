package sec05.chap08.ex02;

import java.sql.SQLOutput;

public class DropDown extends FormElement{
    // 접근제어자가 안붙으면 -> default?
    String[] menus;

    public DropDown(int space, String[] menus) {
        super(space);
        this.menus = menus;
    }

    @Override
    void func() {
        System.out.println("메뉴 선택\n - - - - -");
        for (String menu: menus) {
            System.out.printf(" - %s%n", menu);
        }
    }
}
