package 수학;

import java.util.ArrayList;
import java.util.Scanner;

public class 골드바흐의추측 {
    private static int[] arr = new int[10001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = getPrime();
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            getPartion(sc.nextInt());
        }
    }

    private static int[] getPrime() {
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=Math.sqrt(arr.length-1);i++){
            for(int j=i*i;j<=arr.length-1;j+=i){
                arr[j] = 1;
            }
        }
        return arr;
    }

    private static void getPartion(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 0;
        int min = Integer.MAX_VALUE;
        for(int i=2;i<n;i++){
            if(arr[i]==0){
                list.add(i);
            }
        }

        for(int i=0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                if(list.get(i)+list.get(j)==n && list.get(j)-list.get(i)<min){
                    a = list.get(i);
                    b = list.get(j);
                    min = b-a;
                }
            }
        }
        System.out.println(a+" "+b);
    }
}
