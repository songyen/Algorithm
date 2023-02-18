package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AC {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String[] p = br.readLine().split("");
            int n = Integer.parseInt(br.readLine());
            String[] inputArr = br.readLine().replace("[","").replace("]","").split(",");
            if(n==0) sb.append("error\n");
            else solve(p,inputArr,n);
        }
        System.out.println(sb);
    }

    private static void solve(String[] p, String[] inputArr, int n) {
        Deque<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(Integer.parseInt(inputArr[i]));
        }
        boolean point = true;
        for(int i = 0; i<p.length; i++){
            String c = p[i];
            if(c.equals("R")){
                point = (!point);
            }else if(c.equals("D")){
                if(queue.isEmpty()){
                    sb.append("error\n");
                    return;
                }else{
                    if(point) queue.removeFirst();
                    else queue.removeLast();
                }
            }
        }
        sb.append("[");
        while(!queue.isEmpty()){
            if(point) {
                if(queue.size()==1) sb.append(queue.removeFirst());
                else sb.append(queue.removeFirst()+",");
            }else {
                if(queue.size()==1) sb.append(queue.removeLast());
                else sb.append(queue.removeLast()+",");
            }
        }
        sb.append("]\n");
    }
}
