package 스택_큐;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class 카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> queue = new LinkedList<>();
        for(int i=1;i<=N;i++){
            queue.add(i);
        }
        while(queue.size()!=1){
            queue.removeFirst();
            queue.addLast(queue.removeFirst());
        }
        System.out.println(queue.peekFirst());
    }
}
