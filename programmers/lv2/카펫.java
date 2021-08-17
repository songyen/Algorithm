package lv2;

import java.util.ArrayList;
import java.util.List;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        List<Point> list = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(yellow);i++){
            if(yellow%i==0) list.add(new Point(yellow/i+2,i+2));
        }

        for(int i=0;i<list.size();i++){
            Point point = list.get(i);
            if(point.x * point.y - yellow == brown){
                answer[0] = point.x;
                answer[1] = point.y;
            }
        }
        return answer;
    }

    public class Point{
        private int x;
        private int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
