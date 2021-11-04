package 힙;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                int absO1 = o1;
                int absO2 = o2;
                if(o1<0) absO1*=-1;
                if(o2<0) absO2*=-1;
                if(absO1==absO2){//절대값이 같은 경우
                    return o1-o2;//가장 작은 수 출력(오름차순)
                }else return absO1-absO2;//절대값 가장 작은 값 출력(최소힙)
            }
        });
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(pq.isEmpty()) bw.write("0\n");
                else bw.write(pq.poll()+"\n");
            }
            else pq.add(num);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
