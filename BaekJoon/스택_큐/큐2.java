package 스택_큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case "push" :
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "front" :
                    if(queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.peekFirst()+"\n");
                    break;
                case "back" :
                    if(queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.peekLast()+"\n");
                    break;
                case "size" :
                    sb.append(queue.size()+"\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "pop" :
                    if(queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.removeFirst()+"\n");
                    break;
                default :
                    break;
            }
        }
        System.out.println(sb);
    }
}
