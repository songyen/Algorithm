package lv2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        for(int i : test2.solution("012345","20190620",new String[]{"price=80 code=987654 time=2019062113","price=90 code=012345 time=2019062014","price=120 code=987654 time=2019062010","price=110 code=012345 time=2019062009","price=95 code=012345 time=2019062111"})){
            System.out.println(i);
        }
    }
    public int[] solution(String code, String day, String[] data) {
        List<stockInfo> list = new ArrayList<>();
        for(int i=0;i<data.length;i++){
            String[] info = data[i].split(" ");
            if(info[1].substring(5).equals(code) && info[2].substring(5,13).equals(day)){
                list.add(new stockInfo(Integer.parseInt(info[2].substring(13)), Integer.parseInt(info[0].substring(6))));
            }
        }

        list.sort(new Comparator<stockInfo>() {
            @Override
            public int compare(stockInfo o1, stockInfo o2) {
                int o1Hour = o1.hour;
                int o2Hour = o2.hour;
                return o1Hour-o2Hour;
            }
        });

        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i).price;
        }

        return result;
    }


    public class stockInfo{
        private int hour;
        private int price;

        public stockInfo(int hour, int price){
            this.hour = hour;
            this.price = price;
        }
    }
}
