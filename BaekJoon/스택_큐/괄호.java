package 스택_큐;

import java.io.*;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();
            for(int i=0;i<input.length();i++){
                if(!stack.isEmpty() && stack.peek()=='(' && input.charAt(i)==')'){
                   stack.pop();
                }else stack.push(input.charAt(i));
            }
            if(stack.isEmpty()) sb.append("YES\n");
            else sb.append("NO\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
