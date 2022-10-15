package 구현;

import java.util.Scanner;

public class 별찍기5 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<n+i;j++){
                if(j<n-1-i) sb.append(" ");
                else sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
