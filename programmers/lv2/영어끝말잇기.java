package lv2;

import java.util.*;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        for(int i : solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})){
            System.out.print(i+", ");
        }
    }

    public static int[] solution(int n, String[] words) {
        int[] result = new int[2];
        char lastChar = words[0].charAt(words[0].length() - 1);
        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i])) { //이미 나온 문자
                result[0] = i % n + 1;
                result[1] = i / n + 1;
                break;
            } else {
                list.add(words[i]);
            }

            if (lastChar != words[i].charAt(0)) { //뒷문자와 일치하지 않는 첫문자
                result[0] = i % n + 1;
                result[1] = i / n + 1;
                list.remove(words[i]);
                break;
            } else {
                lastChar = words[i].charAt(words[i].length() - 1);
            }
        }

        if (list.size() == words.length) { //문제없이 끝말잇기 완료
            result[0] = 0;
            result[1] = 0;
        }

        return result;
    }
}
