package 문자열;

import java.util.Scanner;

public class 다이얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int s = 0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if (c >= 'A' && c <= 'C') s += 3;
            else if (c >= 'D' && c <= 'F') s +=4;
            else if (c >= 'G' && c <= 'I') s +=5;
            else if (c >= 'J' && c <= 'L') s +=6;
            else if (c >= 'M' && c <= 'O') s +=7;
            else if (c >= 'P' && c <= 'S') s +=8;
            else if (c >= 'T' && c <= 'V') s +=9;
            else if (c >= 'W' && c <= 'Z') s +=10;
        }
        System.out.println(s);
    }
}
