package 수학;

import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1) System.out.println(1);
        else{
            int start = 2;
            int end;
            int floor = 2;
            while(true){
                end = start+6*(floor-1);
                if(n<=end) {
                    System.out.println(floor);
                    break;
                }else{
                    start = end;
                    floor++;
                }
            }
        }
    }
}
