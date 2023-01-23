package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class 패션왕신해빈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T-->0){
            int n = Integer.parseInt(br.readLine());
            HashMap<String,Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                //종류의 옷이 있으면 종류의 개수 +1 증가
                //종류의 옷이 없으면 종류의 개수 1 추가
                if(!map.containsKey(type)) map.put(type,1);
                else map.put(type, map.get(type)+1);
            }

            int result = 1;
            for(int num : map.values()){
                //안 입는 경우 고려하여 각 종류별 옷의 개수에 +1 해준 값을 곱함
                result *= (num+1);
            }
            //알몸인 상태 제외해야하므로 최종값에 -1
            System.out.println(result-1);
        }
    }
}
