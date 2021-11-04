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
        for(int i=0;i<t;i++){
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            bw.write((n/2+1)+"\n");
            StringTokenizer st;
            list = new ArrayList<>();
            for(int j=0;j<=n/10;j++){
                st = new StringTokenizer(br.readLine());
                for(int k=1;k<=st.countTokens();k++){
                    list.add(Integer.parseInt(st.nextToken()));
                    if(k%2!=0) {
                        sb.append(center()+" ");
                        if((n/2+1)%10==0) {
                            sb.append("\n");
                        }
                    }
                }
            }
            bw.write(sb.toString().trim());
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
