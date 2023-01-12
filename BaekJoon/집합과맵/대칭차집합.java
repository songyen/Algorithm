package 집합과맵;

import java.util.HashSet;
import java.util.Scanner;

public class 대칭차집합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            int num = sc.nextInt();
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }
        System.out.println(set.size());
    }
}
