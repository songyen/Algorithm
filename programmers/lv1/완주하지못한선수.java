/*
* reference : https://wooaoe.tistory.com/54
 */
package lv1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> hash = new HashMap<>();
        for (String arg : participant){
            hash.put(arg, hash.getOrDefault(arg, 0) + 1);
        }
        for (String arg : completion){
            hash.put(arg, hash.get(arg) - 1);
        }
        for (String key : hash.keySet()) {
            if (hash.get(key) != 0) return key;
        }
        return null;
    }
    /*수정 전 코드
    public static String solution(String[] participant, String[] completion) {
        Map<String,Integer> person = new HashMap<>();
        int sameName = 0;

        for(int i=0;i< participant.length;i++){
            if(person.containsKey(participant[i])) {
                sameName = person.get(participant[i]);
                person.put(participant[i],++sameName);
            }else{
                person.put(participant[i],1);
            }
        }

        for(int i=0;i<completion.length;i++){
            if(person.containsKey(completion[i])){
                if(person.get(completion[i]) > 1){//완주한 사람 중 동명이인 존재
                    int num = person.get(completion[i]);
                    person.replace(completion[i], --num);
                }else{
                    person.remove(completion[i]);
                }
            }
        }

         Object[] result = person.keySet().toArray();
         return (String) result[0];
    }*/
}
