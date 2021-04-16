/*
* 2021 4월 월간 코드 챌린지 시즌 2 문제 2번과 유사
 */
package lv2;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        System.out.println("(())()");
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(' ');
        for(int i=0;i<s.length();i++){
            if(stack.peek() == '(' && s.charAt(i) == ')') stack.pop();
            else if(stack.peek() == ' ') stack.push(s.charAt(i));
            else stack.push(s.charAt(i));
        }

        boolean answer = false;
        if(stack.size() == 1) answer = true;

        return answer;
    }
}
