package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 스택 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }else if(cmd.equals("top")){
                if(stack.isEmpty()) System.out.println("-1");
                else System.out.println(stack.peek());
            }else if(cmd.equals("size")) {
                System.out.println(stack.size());
            }else if(cmd.equals("empty")){
                if(stack.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }else{
                if(stack.isEmpty()) System.out.println("-1");
                else System.out.println(stack.pop());
            }


        }
    }
}
