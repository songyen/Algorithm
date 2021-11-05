package 힙;

import java.io.*;
import java.util.*;

public class 중앙값구하기 {
    private static PriorityQueue<Integer> pq;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for(int i=0;i<t;i++){
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            bw.write((n/2+1)+"\n");
            int cnt = 0;
            pq = new PriorityQueue<>();
            for(int j=0;j<n;j++){
                if(j%10==0) st = new StringTokenizer(br.readLine());
                pq.add(Integer.parseInt(st.nextToken()));
                if(j%2==0) {
                    cnt++;
                    if(cnt%10==0) sb.append(center()+"\n");
                    else sb.append(center()+" ");
                }
            }
            bw.write(sb.toString().trim()+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static int center(){
        Stack<Integer> stack = new Stack<>();
        int size = pq.size();
        for(int i=0;i<=size/2;i++){
            stack.push(pq.poll());
        }
        int center = stack.peek();
        while(!stack.isEmpty()){
            pq.add(stack.pop());
        }
        return center;
    }
}
