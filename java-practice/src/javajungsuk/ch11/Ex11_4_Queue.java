package javajungsuk.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4_Queue {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true){
            System.out.print(">>");
            try{
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine().trim();

                if(input.isEmpty()) continue;;

                // q(종료) 명령어는 큐에 저장안됨
                if(input.equalsIgnoreCase("q")) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
                // help 명령어는 큐에 저장
                else if (input.equalsIgnoreCase("help")){
                    save(input);
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어 " + MAX_SIZE +"개를 보여줍니다.");
                }
                else if(input.equalsIgnoreCase("history")){
                    save(input);
                    LinkedList list = (LinkedList)q;        // 실제 인스턴스인 LinkedList로 형 변환

//                    for(int i = 0; i < list.size(); i++){
//                        System.out.println((i+1)+". " + list.get(i));
//                    }

                    // 반복문을 돌 때마다 size()호출 -> final 상수로 지정하고 반복문 실행
                    // size를 한 번만 알아내도록 함 -> 자원 효율, 성능 향상
                    final int SIZE = list.size();
                    for(int i = 0; i < SIZE; i++){
                        System.out.println((i+1)+". " + list.get(i));
                    }
                }
                else{
                    save(input);
                    System.out.println(input);
                }
            } catch(Exception e){
                e.printStackTrace();
                System.out.println("입력 오류입니다.");
            }
        }
    }

    public static void save(String input){
        // 입력한 명령어가 공백이 아닐 경우 큐에 명령어 저장
        if(!input.isEmpty()){
            q.offer(input);
        }

        // 큐의 최대 크기를 넘으면 제일 처음 입력된 명렁어 삭제
        if(q.size()>MAX_SIZE){
            // q.remove()
            q.poll();
        }
    }
}
