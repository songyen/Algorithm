package 구현;

import java.util.ArrayList;
import java.util.Scanner;

public class 쉽게푸는문제 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int s = 1;
        int n = s;
        while(list.size()!=B){
            if(n==0){
                n=s++;
                list.add(s);
            }else{
                list.add(s);
                n--;
            }
        }
        int answer = 0;
        for(int i=A;i<=B;i++){
            answer += list.get(i-1);
        }
        System.out.println(answer);
    }
}
