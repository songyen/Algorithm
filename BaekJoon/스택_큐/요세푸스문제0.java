package 스택_큐;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 요세푸스문제0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Deque<Integer> queue = new LinkedList<>();
        for(int i=1;i<=N;i++){
            queue.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(queue.size()>1){
            for(int i=0;i<K-1;i++){
                queue.addLast(queue.removeFirst());
            }
            sb.append(queue.removeFirst()+", ");
        }
        sb.append(queue.removeFirst()+">");
        System.out.println(sb);
    }
}
