package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 멀티탭스케줄링 {
    private static int N, K;
    private static List<String> tab = new ArrayList<>();//멀티탭에 꽃혀잇는 전기용품 이름
    private static String[] seq; //사용순 전기용품 이름
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        seq = new String[K];
        for(int i=0;i<K;i++){//사용순 전기용품 이름
            seq[i] = st.nextToken();
        }
        br.close();
        int result = 0;//플러그 뽑는 최소횟수
        for(int i=0;i<K;i++){
            if(i<N) tab.add(seq[i]);//구가 모두 비어있는 경우 플러그 꽂아주기.
            if(tab.contains(seq[i])) continue; //플러그가 이미 꽂혀있는 경우
            else{//꽂혀있는 플러그를 빼고, 새로운 전기용품 플러그를 꽂는다.
                if(i!=K-1) tab.set(plugOff(i), seq[i]);//구에 꽂혀있지 않는 마지막 전기용품 사용시 무조건 플러그를 뽑아야한다.
                result++;
            }
        }
        System.out.println(result);
    }

    public static int plugOff(int start){
        int[] used = new int[N];//나중에 사용되는 플러그 순서
        int idx = -1;
        for(int j=start+1;j<K;j++){
            if(tab.contains(seq[j]) && used[tab.indexOf(seq[j])]==0){//가장 최근에 사용되는 순서
                used[tab.indexOf(seq[j])] = j;
            }
        }


        int late = -1;
        for(int i=0;i<N;i++){
            if(used[i]==0){//나중에 사용되지 않는 플러그를 뽑으면 된다.
                idx = i;
                break;
            }//used[i]값이 가장 큰것이 플러그를 뽑아야하는 대상이다.(=가장 나중에 사용되기 때문.)
            if(late<used[i]){//가장 늦게 사용되는 전기용품의 플러그를 뽑아야한다.
                late = used[i];
                idx = i;
            }
        }
        return idx;
    }
}
