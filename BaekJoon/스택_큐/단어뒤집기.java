package 스택_큐;

import java.io.*;
import java.util.Stack;

public class 단어뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(T --> 0) {
            String[] words = br.readLine().split(" ");
            Stack<Character> stack;
            StringBuilder sb = new StringBuilder();
            for(String word : words){
                stack = new Stack<>();
                for(int i=0;i<word.length();i++){
                    stack.push(word.charAt(i));
                }
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            bw.write(sb.toString().trim()+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
