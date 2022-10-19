package 문자열;

import java.util.*;

public class 단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] alphabet = new int[26];
        for(int i=0;i< alphabet.length;i++) alphabet[i] = 0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            alphabet[(int) c - 'A']++;
        }
        int max = -1;
        char c = '?';
        for(int i=0;i<26;i++){
            if(max<alphabet[i]){
                max = alphabet[i];
                c = (char) ((char) i+'A');
            }else if(max==alphabet[i]){
                c = '?';
            }
        }
        System.out.println(c);
    }
}
