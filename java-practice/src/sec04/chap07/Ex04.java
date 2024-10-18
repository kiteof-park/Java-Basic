package sec04.chap07;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int repeatCount = sc.nextInt();

            for (int i = 0; i < repeatCount; i++) {
                System.out.print("호우 ");
            }
            System.out.println("");
        }

//        sc.close();

        String[] strInputs = new String[5];

        for(int i=0; i<strInputs.length; i++){
            strInputs[i] = sc.nextLine();
        }
//        sc.close;

        for (String strInput: strInputs) {
            System.out.println(strInput);
        }
    }
}
