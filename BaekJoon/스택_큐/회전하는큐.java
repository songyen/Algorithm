package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 회전하는큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        for(int i=1;i<=N;i++){
            queue.add(i);
            list.add(i);
        }

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            int findIdx = Integer.parseInt(st.nextToken());
            int idx = list.indexOf(findIdx);
            if(idx<=list.size()/2){
                //2번 연산
                for(int j=0;j<idx;j++){
                    list.remove(queue.peek());
                    list.add(queue.peek());
                    queue.addLast(queue.removeFirst());
                    cnt++;
                }
                list.remove(queue.removeFirst());
            }else{
                //3번 연산
                for(int j=list.size()-1;j>=idx;j--){
                    list.remove(queue.peekLast());
                    list.add(0,queue.peekLast());
                    queue.addFirst(queue.removeLast());
                    cnt++;
                }
                list.remove(queue.removeFirst());
            }
        }
        System.out.println(cnt);
    }
}
