package lv2;

import java.util.*;

public class 캐시 {
    public static void main(String[] args) {
        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
    public static int solution(int cacheSize, String[] cities) {
        Queue<String> cache = new LinkedList<>();
        int answer = 0;
        if(cacheSize == 0){
            answer = cities.length * 5;
            return answer;
        }
        for(int i=0;i<cities.length;i++){
            if(cache.contains(cities[i].toUpperCase())){
                cache.remove(cities[i].toUpperCase());
                cache.add(cities[i].toUpperCase());
                answer += 1;
            }else{
                if(cache.size() < cacheSize) {
                    cache.add(cities[i].toUpperCase());
                    answer += 5;
                }else{
                    cache.remove();
                    cache.add(cities[i].toUpperCase());
                    answer += 5;
                }
            }
        }
        return answer;
    }
}
