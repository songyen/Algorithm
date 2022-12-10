package 수학;

import java.util.Scanner;

public class 베르트랑공준 {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = getPrime();
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n!=0){
                System.out.println(getPrimeNum(n));
            }else break;
        }
    }

    public static int getPrimeNum(int n) {
        int result = 0;
        for(int i=n+1;i<=2*n;i++){
            if(arr[i]==0)result++;
        }
        return result;
    }

    public static int[] getPrime() {
        int[] arr = new int[123456*2+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=Math.sqrt(arr.length-1);i++){
            for(int j=i*i;j<=arr.length-1;j+=i){
                arr[j] = 1;
            }
        }
        return arr;
    }
}
