package 스택_큐;

import java.io.*;
import java.util.*;

public class 프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());
            Queue<Pool> queue = new LinkedList<>();
            List<Pool> printed = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                queue.add(new Pool(Integer.parseInt(st.nextToken()), i));
            }

            while (!queue.isEmpty()) {
                boolean flag = false;
                int first = queue.peek().priority;
                for (Pool p : queue) {
                    if (first < p.priority) {
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    queue.add(queue.poll());
                } else {
                    printed.add(queue.poll());
                }
            }

            for (int i = 0; i < printed.size(); i++) {
                if (printed.get(i).index == location) {
                    bw.write(i + 1+"\n");
                    break;
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

    static class Pool {
        private int priority;
        private int index;

        public Pool(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
}
