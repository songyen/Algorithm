package lv2;

import java.util.*;

public class 방금그곡 {
    public static void main(String[] args) {
        System.out.println(solution("ABC", new String[]{"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"}));
    }
    public static String solution(String m, String[] musicinfos) {
        int mLength = m.length();
        for(int i=0;i<m.length();i++){
            if(m.charAt(i) == '#') mLength--;
        }

        int time, hour, min = 0;
        for(int i=0;i<musicinfos.length;i++){
            hour = Integer.parseInt(musicinfos[i].split(",")[1].split(":")[0]) - Integer.parseInt(musicinfos[i].split(",")[0].split(":")[0]);
            min = Integer.parseInt(musicinfos[i].split(",")[1].split(":")[1]) - Integer.parseInt(musicinfos[i].split(",")[0].split(":")[1]);

            time = hour * 60 + min;
            musicinfos[i] = musicinfos[i].replace(musicinfos[i].split(",")[0]+","+musicinfos[i].split(",")[1], Integer.toString(time));

            if(mLength < time){
                String sound = musicinfos[i].split(",")[2];
                int sLength = sound.length();
                for(int j=0;j<sound.length();j++) {
                    if (sound.charAt(j) == '#') sLength--;
                }

                for(int k=0;k<time/sLength-1;k++) {
                    musicinfos[i] += sound;
                }
            }
        }

        for(String s : musicinfos){
            System.out.println(s);
        }

        List<Integer> select = new ArrayList<>();
        for(int i=0;i<musicinfos.length;i++){
            if(musicinfos[i].split(",")[2].contains(m)){
                System.out.println(i);
                select.add(i);
            }
        }

        String answer = "";
        String playingTime = "";
        if(select.size() > 1){
            playingTime = musicinfos[select.get(0)].split(",")[0];
            for(int i=1;i<=select.size()-1;i++){
                if(playingTime.equals(musicinfos[select.get(i)].split(",")[0])){
                    answer = musicinfos[select.get(0)].split(",")[1];
                }else{
                    if(Integer.parseInt(musicinfos[select.get(i)].split(",")[0]) == Math.max(Integer.parseInt(playingTime),Integer.parseInt(musicinfos[select.get(i)].split(",")[0]))){
                        answer = musicinfos[select.get(i)].split(",")[1];
                        playingTime = musicinfos[select.get(i)].split(",")[1];
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
