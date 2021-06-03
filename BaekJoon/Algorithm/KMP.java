/*
* reference : https://bowbowbow.tistory.com/6#comment5168448, https://imnotabear.tistory.com/118
* source : BackJoon 1786번 [찾기]
 */

package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class KMP{
    private static int cnt = 0;
    private static List<Integer> indexList;

    public static int[] getPi(String p){
        int[] pi = new int[p.length()];
        int j = 0;
        for(int i=1;i<p.length();i++){
            while(j>0 && p.charAt(i) != p.charAt(j)){
                j = pi[j-1];
            }
            if(p.charAt(i) == p.charAt(j)){
                pi[i] = ++j;
            }
        }
        return pi;
    }

    public static void kmp(String T, String P){
        int[] pi = getPi(P);
        int j=0;
        for(int i=0;i<T.length();i++){
            while(j>0 && T.charAt(i) != P.charAt(j)){
                j = pi[j-1];
            }
            if(T.charAt(i) == P.charAt(j)){
                if(j==P.length()-1){
                    ++cnt;
                    indexList.add(i-j+1);
                    j=pi[j];
                }
                else j++;
            }
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String T = br.readLine();
        String P = br.readLine();
        indexList = new ArrayList<>();
        kmp(T,P);
        System.out.println(cnt);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cnt;i++){
            if(i==cnt-1){
                sb.append(indexList.get(i));
            }else{
                sb.append(indexList.get(i)+" ");
            }
        }
        System.out.println(sb);
    }
}
