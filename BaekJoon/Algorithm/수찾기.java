/*
 * source : BackJoon 1920번 Hash(h0ngjun7)문제집 [수찾기]
 * 자료구조 : HashSet
 */
package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n_num = Integer.parseInt(bf.readLine());
        HashSet<String> nSet = new HashSet<>();
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n_num;i++){
            nSet.add(st.nextToken());
        }

        int m_num = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<m_num;i++){
            if(nSet.contains(st.nextToken())) System.out.println("1");
            else System.out.println("0");
        }
    }
}
