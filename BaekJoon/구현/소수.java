package 구현;

import java.util.ArrayList;
import java.util.Scanner;

public class 소수 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=M;i<=N;i++){
            if(i==1) continue;
            if(isPrime(i)) list.add(i);
        }
        if(list.isEmpty()) System.out.println("-1");
        else{
            int sum = 0;
            for(int n : list) sum+=n;
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }

    public static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
