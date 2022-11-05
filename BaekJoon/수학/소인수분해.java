package 수학;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 소인수분해 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(N);i++){
            while(N%i==0) {
                N/=i;
                result.add(i);
            }
        }
        result.sort(Comparator.comparingInt(o -> o));
        for(int i : result){
            System.out.println(i);
        }

    }
}
