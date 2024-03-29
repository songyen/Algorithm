package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 팩토리얼 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int n = list.size()/2;
        if(list.size()%2==0) System.out.print(list.get(n)*list.get(n));
        else System.out.print(list.get(n)*list.get(n+1));
    }
}
