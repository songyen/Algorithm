package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 인간컴퓨터상호작용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int T = Integer.parseInt(br.readLine());
        //알파벳의 인덱스 저장
        ArrayList<Integer>[] list = new ArrayList[26];
        for(int i=0;i<26;i++){
            list[i] = new ArrayList<>();
        }
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            list[c-'a'].add(i);
        }

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            char alphabet = st.nextToken().charAt(0);
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for(int i=0;i<list[alphabet-'a'].size();i++){
                int idx = list[alphabet-'a'].get(i);
                if(start<=idx  && idx<=end) cnt++;
            }
            sb.append(cnt+"\n");
        }
        System.out.println(sb.toString().trim());
    }
}
