package 그리디알고리즘;

import java.util.Scanner;

public class 잃어버린괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("-");
        int min = 0;
        for(int i=0;i<str.length;i++){
            String[] num = str[i].split("[+]");
            int temp = 0;
            for(int j=0;j<num.length;j++){
                temp+=Integer.parseInt(num[j]);
            }
            if(i==0) min = temp;
            else min -= temp;
        }
        System.out.println(min);
    }
}
