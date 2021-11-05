package 힙;

import java.io.*;
import java.util.*;

public class 중앙값구하기 {
    private static PriorityQueue<Integer> maxHeap;
    private static PriorityQueue<Integer> minHeap;
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
            maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);
            minHeap = new PriorityQueue<>();
            for(int j=0;j<n;j++){
                if(j%10==0) st = new StringTokenizer(br.readLine());
                addHeap(Integer.parseInt(st.nextToken()));
                if(j%2==0) {
                    cnt++;
                    if(cnt%10==0) sb.append(maxHeap.peek()+"\n");
                    else sb.append(maxHeap.peek()+" ");
                }
            }
            bw.write(sb.toString().trim()+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    private static void addHeap(int x) {
        if(minHeap.size()== maxHeap.size()) maxHeap.add(x);
        else minHeap.add(x);

        if(!minHeap.isEmpty()) {
            if (maxHeap.peek() > minHeap.peek()) {
                minHeap.add(maxHeap.poll());
                maxHeap.add(minHeap.poll());
            }
        }
    }
}
