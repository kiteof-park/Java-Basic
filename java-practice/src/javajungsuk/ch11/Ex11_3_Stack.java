package javajungsuk.ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3_Stack {
    public static void main(String[] args) {
        Stack st = new Stack();
//        String expression = "((3+5)*8-2)";
        String expression ="((3+5)*8-2))))";

        System.out.println("expression :" + expression);

        // 여는 괄호'(' 일떄는 push, 닫는 괄호 ')'일떄는 pop -> 빈 스택인 경우 괄호 검사 Ok
        try{
            for(int i = 0; i < expression.length(); i++){
                char ch = expression.charAt(i);

                if(ch == '(') st.push(ch+"");
                else if(ch ==')') st.pop();
            }
            if(st.isEmpty()){
                System.out.println("괄호가 일치합니다.");
            } else {
                System.out.println("괄호가 일치하지 않습니다.");
            }
            // 닫는 괄호가 더 많을 경우 빈 스택에서 pop()을 수행하므로 EmptyStackException
        } catch(EmptyStackException e){
            System.out.println("예외 발생! 괄호가 일치하지 않습니다.");
        }
    }
}
