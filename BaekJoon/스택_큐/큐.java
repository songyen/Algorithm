package 스택_큐;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 큐 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st;
        int last = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")){
                last = Integer.parseInt(st.nextToken());
                queue.add(last);
            }else if(cmd.equals("pop")){
                if(queue.isEmpty()) System.out.println("-1");
                else System.out.println(queue.poll());
            }else if(cmd.equals("size")){
                System.out.println(queue.size());
            }else if(cmd.equals("empty")){
                if(queue.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }else if(cmd.equals("front")){
                if(queue.isEmpty()) System.out.println("-1");
                else System.out.println(queue.peek());
            }else{
                if(queue.isEmpty()) System.out.println("-1");
                else System.out.println(last);
            }
        }
        br.close();
    }
}
