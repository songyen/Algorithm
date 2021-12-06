package 스택_큐;

import java.util.Scanner;
import java.util.Stack;

public class 괄호의값 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int val = 1;
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);

            if(x=='(' || x=='['){
                stack.push(x);
                val*= (x=='(')?2:3;
            }else if(x==')'){
                if(stack.isEmpty() || stack.peek()!='(') {//올바르지 않은 괄호열
                    result =0;
                    break;
                }
                //올바른 괄호열
                if(i-1>0 && str.charAt(i-1)=='(') result+=val;
                stack.pop();
                val/=2;
            }else{
                if(stack.isEmpty() || stack.peek()!='[') {//올바르지 않은 괄호열
                    result =0;
                    break;
                }
                //올바른 괄호열
                if(i-1>0 && str.charAt(i-1)=='[') result+=val;
                stack.pop();
                val/=3;
            }
        }
        if(!stack.isEmpty()) result = 0;
        System.out.println(result);
    }
}
