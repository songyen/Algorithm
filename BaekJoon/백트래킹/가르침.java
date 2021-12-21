package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 가르침 {
    private static int N, K;
    private static String[] word;
    private static int mask;
//    private static boolean[] visitied = new boolean[26];
    private static int max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        if(K<5) {
            System.out.println("0");
            return;
        }
        else if(K==26) {
            System.out.println(N);
            return;
        }
        else {
            //a,n,t,i,c 필수로 가르치기에 가르칠 수 있는 K-5개 글자에서 제외
            word= new String[N];
            for (int i = 0; i < N; i++) {
                String str = br.readLine().replaceAll("[a,n,t,i,c]", "");
                word[i] = str;
            }
//            visitied['a'-'a'] = true;
//            visitied['n'-'a'] = true;
//            visitied['t'-'a'] = true;
//            visitied['i'-'a'] = true;
//            visitied['c'-'a'] = true;
            //k-5개의 글자조합
//            combination(0,0);
            /*
            * 비트마스크활용해 글자조합 구하기
             */
            mask = 0;
            mask |= 1<<'a'-'a';
            mask |= 1<<'n'-'a';
            mask |= 1<<'t'-'a';
            mask |= 1<<'i'-'a';
            mask |= 1<<'c'-'a';

            combination(0, 1, mask);
            System.out.println(max);
        }
        br.close();
    }


    private static void combination(int len, int start, int mask) {
        if(len==K-5){
            int cnt = 0;
            for(int i=0;i<N;i++){
                boolean read = true;
                for(int j=0;j<word[i].length();j++){
                    if((mask&(1<<word[i].charAt(j)-'a'))==0){
                        read = false;
                        break;
                    }
                }
                if(read) cnt++;
            }
            max = Math.max(max, cnt);
            return;
        }
        for(int i=start;i<26;i++){
            if((mask&(1<<i))!=0) continue;
            combination(len+1, i+1, mask | 1<<i);
        }
    }
    /* visited배열활용해 글자조합 구하기
    private static void combination(int alpha, int len) {
        if(len==K-5){
            int cnt = 0;
            for(int i=0;i<N;i++){
                boolean read = true;
                for(int j=0;j<word[i].length();j++){
                    if(!visitied[word[i].charAt(j)-'a']){
                        read = false;
                        break;
                    }
                }
                if(read) cnt++;
            }
            max = Math.max(max, cnt);
            return;
        }
        for(int i=alpha;i<26;i++){
            if(!visitied[i]){
                visitied[i] = true;
                combination(i,len+1);
                visitied[i] = false;
            }
        }
    }*/
}
