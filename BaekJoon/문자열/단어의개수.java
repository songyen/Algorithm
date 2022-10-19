package 문자열;

import java.util.Scanner;

public class 단어의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split(" ");
        if(input[0].equals("")) System.out.println(0);
        else System.out.println(input.length);
    }
}
