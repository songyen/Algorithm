package lv2;

import java.util.*;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
    }
    public static int solution(String s){
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }

        for(int i=0;i<list.size();){
            if(i == list.size()-1) break;
            if(list.get(i) == list.get(i+1)){
                System.out.print(i+", ");
                list.remove(i);
                list.remove(i+1);
                for(Character c : list){
                    System.out.print(c);
                }
                System.out.println();
                i = 0;
            }else i++;
        }

        if(list.size() == 0) return 1;
        else return 0;
    }
}
