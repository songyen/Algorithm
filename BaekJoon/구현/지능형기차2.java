package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 지능형기차2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;
        for(int i=0;i<10;i++){
            st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            if(i==0) list.add(in);
            else if(i==9) list.add(list.get(i-1)-out);
            else list.add(list.get(i-1)-out+in);
        }
        Collections.sort(list);
        System.out.println(list.get(9));
    }
}
