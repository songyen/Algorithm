package Algorithm;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Unionfind2 {
    static HashMap<String,String> friendNW;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        friendNW = new HashMap<>();
        for(int i=0;i<t;i++){
            int F = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<F;j++){
                String a = st.nextToken().toUpperCase();
                String b = st.nextToken().toUpperCase();
//                if(friendNW.containsKey(a)||friendNW.containsKey(b)){
//                    union(a,b);
//                }
                friendNW.put(a,a);
                friendNW.put(b,a);
            }
            friendNW.clear();
        }
    }
}
