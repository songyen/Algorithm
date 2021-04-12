package lv2;

import java.util.*;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
    public static int solution(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(' ');
        stack.push(s.charAt(0));

        for(int i=1;i<s.length();i++){
            if(stack.peek() == s.charAt(i)) {
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }

        if(stack.size() == 1) return 1;
        else return 0;
    }
}
