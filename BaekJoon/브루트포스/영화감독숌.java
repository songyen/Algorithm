package 브루트포스;

import java.util.Scanner;

public class 영화감독숌 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int seq = 0;
        int end = 666;
        String answer = "";
        for(int i=666;;i++){
            if((i+"").contains(end+"")) seq++;
            if(seq==n) {
                answer = i+"";
                break;
            }
        }
        System.out.println(answer);
    }
}
