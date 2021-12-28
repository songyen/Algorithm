package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 멀티탭스케줄링 {
    private static int N, K;
    private static HashSet<String> tab = new HashSet<>();//멀티탭에 꽃혀잇는 전기용품 이름
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
            //if(i<N) tab.add(seq[i]);//구가 모두 비어있는 경우 플러그 꽂아주기.(예외발생: 3구인데, 드라이기 카메라 드라이기 인경우 원래는 드라이기, 카메라 2구만 차야하는데 이와같이 한다면 드라이기, 카메라, 드라이기 3구가 차게 된다.
            if(!tab.contains(seq[i])){
                if(tab.size()<N) tab.add(seq[i]);//구가 모두 차지 않은 상태는 그냥 플러그를 꽂아주면 된다.
                else{//구가 모두 차있는 상태
                    if(i!=K-1){
                        tab.remove(plugOff(i));//가장 늦게 사용되는 플러그 제거
                        tab.add(seq[i]);//새로운 전기용품 플러그 꽂는다
                    }//구에 꽂혀있지 않는 마지막 전기용품 사용시 무조건 플러그를 뽑아야한다.
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static String plugOff(int start){
        int rec = -1;//나중에 가장 먼저 사용되는 순서
        String plugName = "";
        for(String name : tab){
            int idx = -1;
            for(int i=start+1;i<K;i++){
                if(name.equals(seq[i])){
                    idx = i;
                    break;
                }
            }
            if(idx == -1){//나중에 사용되지 않는다
                plugName = name;
                break;
            }else{
                if(rec<idx){
                    rec = idx;
                    plugName = name;
                }
            }
        }
        return plugName;
    }
}
