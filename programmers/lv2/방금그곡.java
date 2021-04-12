package lv2;

import java.util.*;

public class 방금그곡 {
    public static void main(String[] args) {
        System.out.println(solution("ABCDEFG", new String[]{"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
    }
    public static String solution(String m, String[] musicinfos) {
        int time = 0;
        String startTime = "";
        String endTime = "";
        for(int i=0;i<musicinfos.length;i++){
            startTime = musicinfos[i].split(",")[0];
            endTime = musicinfos[i].split(",")[1];

            time = Integer.parseInt(endTime) * 60 - Integer.parseInt(startTime);
            musicinfos[i] = musicinfos[i].replace(startTime+","+endTime, Integer.toString(time));

            if(m.length() > time) musicinfos[i] += musicinfos[i].split(",")[3];
        }

        List<Integer> select = new ArrayList<>();
        for(int i=0;i<musicinfos.length;i++){
            if(musicinfos[i].split(",")[3].contains(m)){
                select.add(i);
            }
        }

        String answer = "";
        String playingTime = "";
        if(select.size() > 1){
            playingTime = musicinfos[select.get(0)].split(",")[0];
            for(int i=1;i<select.size();i++){
                if(playingTime.equals(musicinfos[select.get(i)].split(",")[0])){
                    answer = musicinfos[select.get(0)].split(",")[1];
                }else{
                    if(musicinfos[select.get(i)].split(",")[0].equals(Math.max(Integer.parseInt(playingTime),Integer.parseInt(musicinfos[select.get(i)].split(",")[0])))){
                        answer = musicinfos[select.get(i)].split(",")[1];
                    }else{
                        answer = musicinfos[select.get(0)].split(",")[1];
                    }
                }
            }
        }else if(select.size() == 0){
            answer = "(None)";
        }else{
            answer = musicinfos[select.get(0)].split(",")[1];
        }

        return answer;
    }
}
