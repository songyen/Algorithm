package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 동전1 {
    private static int n, k;
    private static int result = 0;
    private static ArrayList<Integer> coin;
    private static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        coin = new ArrayList<>();
        for(int i=0;i<n;i++){
            coin.add(Integer.parseInt(br.readLine()));
        }
        coin.sort((o1,o2)->o2-o1);
        int max = k/coin.get(0);
        for(int i=max;i>=0;i--){
            int value = coin.get(0)*i;
            if(value==k){
                result++;
                continue;
            }else{
                BFS(value, 1);
            }
        }
        System.out.println(result);
    }
    public static void BFS(int value, int cnt){
        if(cnt!=n-1){
            int max = (k-value)/coin.get(cnt);
            for(int i=max;i>=0;i--){
                int sum = value+coin.get(cnt)*i;
                if(sum==k) result++;
                else queue.offer(sum);
            }
            if(cnt==n-2) BFS(queue.peek(), cnt+1);
            else BFS(queue.poll(), cnt+1);
        }else{//마지막, 가장 작은 가치의 동전을 사용하는 경우
            int minCoin = coin.get(cnt);
            while(!queue.isEmpty()){
                int exchange = k-queue.poll();
                if(exchange%minCoin==0){
                    result++;
                }
            }
        }
    }
}
