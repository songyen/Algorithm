package lv3;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class 베스트앨범 {
    public int[] solution(String[] genres, int[] plays) {
        //Step1
        HashMap<String, Integer> genreMap = new HashMap<>();
        for(int i=0;i<plays.length;i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i],0)+plays[i]);//genreMap(장르, 장르별 총 재생수)
        }

        //Step2
        List<Map.Entry<String, Integer>> genre_plays = new LinkedList<>(genreMap.entrySet());
        Collections.sort(genre_plays, (o1, o2)-> o2.getValue().compareTo(o1.getValue()));//장르 총 재생수를 기준으로 내림차순 정렬

        HashMap<Integer, Integer> playsPerNum = new HashMap<>();
        List<Integer> answer = new ArrayList<>();
        //Step3
        for(Map.Entry<String, Integer> entry : genre_plays){
            for(int i=0;i<genres.length;i++){
                if(entry.getKey().equals(genres[i])){
                    playsPerNum.put(i, plays[i]);//장르별 (고유번호, 재생수) hashmap 생성
                }
            }

            //Step3-1
            List<Map.Entry<Integer, Integer>> num_plays = new LinkedList<>(playsPerNum.entrySet());
            Collections.sort(num_plays, (o1, o2)-> o2.getValue().compareTo(o1.getValue()));//playsPerNum(고유번호, 재생수)의 재생수 기준 내림차순으로 정렬(재생수 같다면, 고유번호 낮은 순으로 정렬)

            //Step3-2
            answer.add(num_plays.get(0).getKey());
            if(num_plays.size()!=1) answer.add(num_plays.get(1).getKey());

            //Step3-3
            playsPerNum.clear();
        }

        //Step4
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
