package javajungsuk.ch11;

import java.util.TreeSet;

public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("apple");       set.add("breeze");      set.add("crimson");
        set.add("ambition");    set.add("banana");      set.add("clarity");
        set.add("delight");     set.add("empathy");     set.add("flourish");
        set.add("harmony");     set.add("journey");     set.add("inspire");

        System.out.println(set.subSet(from, to));   // b부터 d까지(d는 제외)
        System.out.println(set.subSet("a", "z"));   // 모든 단어 출력

    }
}
