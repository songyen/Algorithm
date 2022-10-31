package 문자열;

import java.util.Scanner;

public class 크로아티아알파벳 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = new String[]{"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0;i<arr.length;i++) {
            input = input.replaceAll(arr[i], "a");
        }
        System.out.println(input.length());
    }
}
