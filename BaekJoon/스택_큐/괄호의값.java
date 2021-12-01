package 스택_큐;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class 괄호의값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        String result = "";
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            char xNum;
            if(stack.isEmpty()){
                stack.push(x);
                result+="0";
                continue;
            }
            if (stack.peek() == '(' && x == ')') {
                stack.pop();
                if(stack.isEmpty()) {
                    int sum =0;
                    for (int j = 0; j < result.length(); j++) {
                        if (result.charAt(j) != 0) sum += result.charAt(j) - '0';
                    }
                    result = "";
                    list.add(sum *=2);
                }else {
                    xNum = result.charAt(result.length()-1);
                    if (xNum != '0') result = result.substring(0,result.length()-1)+"0"+ (xNum - '0') * 2;
                    else result += "2";
                }
            } else if (stack.peek() == '[' && x == ']') {
                stack.pop();
                if(stack.isEmpty()) {
                    int sum = 0;
                    for (int j = 0; j < result.length(); j++) {
                        if (result.charAt(j) != 0) sum += result.charAt(j) - '0';
                    }
                    result = "";
                    list.add(sum *=3);
                }else {
                    xNum = result.charAt(result.length()-1);
                    if (xNum != '0')  result = result.substring(0,result.length()-1)+"0"+ (xNum - '0') * 3;
                    else result += "3";
                }
            } else{
                stack.push(x);
                result += "0";
            }
        }
        if(stack.isEmpty()) {
            int answer = 0;
            for(int i : list) answer+=i;
            System.out.println(answer);
        }
        else System.out.println("0");
    }
}
