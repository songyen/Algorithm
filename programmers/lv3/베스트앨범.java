package lv3;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> genreMap = new HashMap<>();
        for(int i=0;i<plays.length;i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i],0)+plays[i]);//genreMap(장르, 재생수)
        }

        List<Map.Entry<String, Integer>> entries = new LinkedList<>(genreMap.entrySet());
        Collections.sort(entries, (o1,o2)-> o2.getValue().compareTo(o1.getValue()));//장르 총 재생수 내림차순으로 정렬
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();//map순서 보장
        for(Map.Entry<String, Integer> entry : entries){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        HashMap<Integer, Integer> playsPerNum = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        for(String genre : sortedMap.keySet()){
            for(int i=0;i<genres.length;i++){
                if(genre.equals(genres[i])){
                    playsPerNum.put(i, plays[i]);//장르별 (고유번호, 재생수) map 생성
                }
            }

            List<Map.Entry<Integer, Integer>> sortedEntries = new LinkedList<>(playsPerNum.entrySet());
            Collections.sort(sortedEntries, (o1,o2)-> o2.getValue().compareTo(o1.getValue()));//map(고유번호, 재생수)의 재생수 기준 내림차순으로 정렬(재생수 같다면, 고유번호 낮은 순으로 정렬)

            answer.add(sortedEntries.get(0).getKey());
            if(sortedEntries.size()!=1) answer.add(sortedEntries.get(1).getKey());

            playsPerNum.clear();
        }

        int[] result = new int[answer.size()];
        for(int i=0;i<answer.size();i++){
            result[i] = answer.get(i);
        }

        return result;
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(new int[]{4,1,3,0}, solution(new String[]{"classic", "pop", "classic", "classic", "pop"},
                                                new int[]{500, 600, 150, 800, 2500}));
    }
}
