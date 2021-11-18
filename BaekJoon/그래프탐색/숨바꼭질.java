package 그래프탐색;

import java.util.*;

public class 숨바꼭질 {
    private static int N;
    private static int K;
    private static int[] map = new int[100001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        if(N==K) System.out.println("0");
        else if(N>K) System.out.println(N-K);
        else {
            bfs();
            System.out.println(map[K]);
        }
    }

    static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        while (!queue.isEmpty()) {
            N = queue.poll();
            if (N == K) {
                break;
            }
            if (N - 1 >= 0 && map[N - 1] == 0) {
                queue.offer(N - 1);
                map[N - 1] = map[N] + 1;
            }
            if (N + 1 <= 100000 && map[N + 1] == 0) {
                queue.offer(N + 1);
                map[N + 1] = map[N] + 1;
            }
            if (N * 2 <= 100000 && map[N * 2] == 0) {
                queue.offer(N * 2);
                map[N * 2] = map[N] + 1;
            }
        }
    }
}
