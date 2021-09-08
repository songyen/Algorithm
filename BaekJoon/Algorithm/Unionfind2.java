/*
 * reference : https://youngest-programming.tistory.com/458
 * source : BackJoon 4195번 [친구 네트워크]
 */
package Algorithm;


import java.util.HashMap;
import java.util.Scanner;

public class Unionfind2 {
    private static int T;
    private static int F;
    private static int[] parent;
    private static int[] count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            F = sc.nextInt();
            parent = new int[F * 2];
            count = new int[F * 2];
            for (int i = 0; i < F * 2; i++) {
                parent[i] = i;
                count[i] = 1;
            }
            HashMap<String, Integer> map = new HashMap<>(); // 이름, 인덱스(노드번호)
            int index = 0;
            for (int f = 0; f < F; f++) {
                String friend1 = sc.next();
                String friend2 = sc.next();
                if (!map.containsKey(friend1)) { //해당 친구이름이 아직 없는 경우 인덱스 부여
                    map.put(friend1, index++);
                }
                if (!map.containsKey(friend2)) {
                    map.put(friend2, index++);
                }
                System.out.println(union(map.get(friend1), map.get(friend2)));
            }
        }
    }

    private static int find(int a) {
        if (parent[a] == a) return a;
        else return parent[a] = find(parent[a]);
    }

    private static int union(int a, int b) {
        a = find(a);
        b = find(b);
        if(a!=b){
            if(count[a] < count[b]){
                parent[a] =b;
                count[b]+=count[a];
                return count[b];
            }else{
                parent[b] = a;
                count[a]+=count[b];
                return count[a];
            }
        }
        return count[a];
    }
}
