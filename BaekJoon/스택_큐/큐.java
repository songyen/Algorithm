package 스택_큐;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 큐 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if(cmd.equals("push")){
                deque.add(Integer.parseInt(st.nextToken()));
            }else if(cmd.equals("pop")){
                if(deque.isEmpty()) System.out.println("-1");
                else System.out.println(deque.poll());
            }else if(cmd.equals("size")){
                System.out.println(deque.size());
            }else if(cmd.equals("empty")){
                if(deque.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }else if(cmd.equals("front")){
                if(deque.isEmpty()) System.out.println("-1");
                else System.out.println(deque.peek());
            }else{
                if(deque.isEmpty()) System.out.println("-1");
                else System.out.println(deque.peekLast());
            }
        }
        br.close();
    }
}
