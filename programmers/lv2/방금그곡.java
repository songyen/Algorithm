package lv2;

import java.util.*;

public class 방금그곡 {
    public static void main(String[] args) {
        System.out.println(solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}));
    }
    public static String solution(String m, String[] musicinfos) {
        m = sheetMusic(m);
        int playingTime , hour, min = 0;
        String sound = "";
        List<Integer> select = new ArrayList<>();
        for(int i=0;i<musicinfos.length;i++){
            sound = musicinfos[i].split(",")[3];
            musicinfos[i] = musicinfos[i].replace(sound, sheetMusic(sound));
            sound = musicinfos[i].split(",")[3];

            hour = Integer.parseInt(musicinfos[i].split(",")[1].split(":")[0]) - Integer.parseInt(musicinfos[i].split(",")[0].split(":")[0]);
            min = Integer.parseInt(musicinfos[i].split(",")[1].split(":")[1]) - Integer.parseInt(musicinfos[i].split(",")[0].split(":")[1]);
            playingTime = hour*60 + min;
            musicinfos[i] = musicinfos[i].replace(musicinfos[i].split(",")[0]+","+musicinfos[i].split(",")[1], Integer.toString(playingTime));

            if(sound.length() < playingTime){
                for(int j=0;j<playingTime/sound.length()-1;j++){
                    musicinfos[i] += sound;
                }
            }else{
                musicinfos[i] = musicinfos[i].replace(sound, sound.substring(0,playingTime));
            }

            if(musicinfos[i].split(",")[2].contains(m)) {
                select.add(i);
            }
        }

        for(String s : musicinfos){
            System.out.println(s);
        }

        int time, longPlayingTime = 0;
        String answer = "";
        if(select.size() > 1){
            longPlayingTime = Integer.parseInt(musicinfos[select.get(0)].split(",")[0]);
            for(int i=1;i<select.size();i++){
                time = Integer.parseInt(musicinfos[select.get(i)].split(",")[0]);
                if(Integer.parseInt(musicinfos[select.get(i)].split(",")[0]) == Math.max(longPlayingTime,Integer.parseInt(musicinfos[select.get(i)].split(",")[0]))){
                    longPlayingTime = Integer.parseInt(musicinfos[select.get(i)].split(",")[0]);
                    answer = musicinfos[select.get(i)].split(",")[1];
                }else{
                    answer = musicinfos[select.get(0)].split(",")[1];
                }

            }
        }else if(select.size() == 1){
            answer = musicinfos[select.get(0)].split(",")[1];
        }else{
            answer = "(None)";
        }

        return answer;
    }
    public static String sheetMusic(String sound){
        for(int i=0;i<sound.length();i++){
            if(sound.charAt(i) == '#') sound = sound.replaceFirst("[A-G]#",sound.substring(i-1,i).toLowerCase());
        }
        return sound;
    }
}
