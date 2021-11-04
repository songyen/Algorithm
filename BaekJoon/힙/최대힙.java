package 힙;

import java.io.*;
import java.util.PriorityQueue;

public class 최대힙 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num>0){
                pq.add(num);
            }else{
                if(pq.isEmpty()) bw.write("0\n");
                else bw.write(pq.poll()+"\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
