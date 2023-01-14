package 집합과맵;

import java.util.HashSet;
import java.util.Scanner;

public class 서로다른부분문자열의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            String name = "";
            for(int j=i;j<str.length();j++){
                name+=str.charAt(j);
                set.add(name);
            }
        }
        System.out.println(set.size());
    }
}
