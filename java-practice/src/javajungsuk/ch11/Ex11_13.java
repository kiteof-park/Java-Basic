package javajungsuk.ch11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i =0; set.size() < 6; i++){
            set.add(new CompTest());
        }
        System.out.println(set);
    }
}

class CompTest implements Comparable{
    @Override
    public int compareTo(Object obj) {
        return 1;
    }
}