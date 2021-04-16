/*
*reference : https://hongjuzzang.github.io/solution/code_p17683/
 */

package lv2;

import java.util.*;

public class 방금그곡 {
    public static void main(String[] args) {
        방금그곡 test = new 방금그곡();
        System.out.println(test.solution("CC#BCC#BCC#BCC#B", new String[]{"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"}));
    }
    public String solution(String m, String[] musicinfos) {
        m = getMelody(m);
        int playingTime = 0;
        String melody = "";
        List<Info> selected = new ArrayList<>();
        for(int i=0;i<musicinfos.length;i++){
            String[] t = musicinfos[i].split(",");
            Info info  = new Info(i, getPlayingTime(t[0], t[1]), t[2], getMelody(t[3]));

            if (info.totalMelody.length() >= m.length() && info.totalMelody.contains(m))
                selected.add(info);
        }

        String answer = "";
        if(selected.size() > 1){
            selected.sort((o1, o2) -> {
                if(o1.playingTime == o2.playingTime){
                    return o1.index - o2.index;
                }else return o2.playingTime - o1.playingTime;
            });
            answer = selected.get(0).music;
        }else if(selected.size() == 1){
            answer = selected.get(0).music;
        }else{
            answer = "(None)";
        }

        return answer;
    }
    public String getMelody(String melody){
        for(int i=0;i<melody.length();i++){
            if(melody.charAt(i) == '#') melody = melody.replaceFirst("[A-G]#",melody.substring(i-1,i).toLowerCase());
        }
        return melody;
    }
    public int getPlayingTime(String start, String finish){
        int hour = Integer.parseInt(finish.split(":")[0]) - Integer.parseInt(start.split(":")[0]);
        int min = Integer.parseInt(finish.split(":")[1]) - Integer.parseInt(start.split(":")[1]);
        return hour*60 + min;
    }
    class Info{
        private int index;
        private int playingTime;
        private String music;
        private String totalMelody;

        public Info(int index, int playingTime, String music, String melody){
            this.index = index;
            this.playingTime = playingTime;
            this.music = music;
            totalMelody = getTotalMelody(melody, playingTime);
        }

        public String getTotalMelody(String melody, int playingTime){
            if (melody.length() > playingTime)
                return melody.substring(0, playingTime);
            StringBuilder sb = new StringBuilder();
            while (sb.length() < playingTime) {
                sb.append(melody);
            }
            return sb.substring(0, playingTime);
        }
    }
}
