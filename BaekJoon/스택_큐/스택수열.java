package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택수열 {
    private static int n;
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solve());
    }

    private static String solve() {
        int idx = 0;
        int num = 0;
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while(num<=n && idx<n){
            if(!stack.isEmpty()){
                if(stack.peek()==arr[idx]) {
                    stack.pop();
                    sb.append("-\n");
                    idx++;
                }else {
                    if(num+1>n){
                        return "NO";
                    }else {
                        sb.append("+\n");
                        stack.push(++num);
                    }
                }
            }else{
                sb.append("+\n");
                stack.push(++num);
            }
        }
        return sb.toString();
    }
}
