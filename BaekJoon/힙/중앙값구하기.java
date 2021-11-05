package 힙;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 중앙값구하기 {
    private static List<Integer> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = null;
        for(int i=0;i<t;i++){
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            bw.write((n/2+1)+"\n");
            list = new ArrayList<>();
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(j%10==0) st = new StringTokenizer(br.readLine());
                list.add(Integer.parseInt(st.nextToken()));
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

    private static int center() {
        Collections.sort(list);
        return list.get(list.size()/2);
    }
}
