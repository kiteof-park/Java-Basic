package javajungsuk.ch11;

import java.util.TreeSet;

public class Ex11_15 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = new int[10];

        for(int i = 0; i < score.length; i++){
            score[i] = (int)(Math.random() * 100) + 1;
            set.add(score[i]);
        }

        System.out.println(set);
        System.out.println(set.headSet(50));       // 50미만의 부분집합
        System.out.println(set.tailSet(50));     // 50이상의 부분집합

    }
}
