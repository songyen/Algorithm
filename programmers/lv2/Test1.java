/*
* KaKao InternShip CodingTest Test1 [문자열문제]
 */
package lv2;

import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(solution("23four5six7"));
    }
    public static int solution(String s) {
        HashMap<String, Integer> numToString = new HashMap<>();
        int num = 0;
        numToString.put("zero", num++);
        numToString.put("one", num++);
        numToString.put("two", num++);
        numToString.put("three", num++);
        numToString.put("four", num++);
        numToString.put("five", num++);
        numToString.put("six", num++);
        numToString.put("seven", num++);
        numToString.put("eight", num++);
        numToString.put("nine", num++);

        String result = "";
        StringBuilder sb = new StringBuilder();
        String key = "";
        for(int i=0;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).matches("[0-9]")){
                result += s.charAt(i);
            }else{
                sb.append(s.charAt(i));
                if(numToString.containsKey(sb.toString())){
                    key = sb.toString();
                    s.replace(key, Integer.toString(numToString.get(key)));
                    result += Integer.toString(numToString.get(key));
                    sb = new StringBuilder();
                }
            }
        }

        return Integer.parseInt(result);
    }
}
