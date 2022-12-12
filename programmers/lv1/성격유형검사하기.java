package lv1;

import java.sql.SQLOutput;
import java.util.HashMap;

public class 성격유형검사하기 {
    public static void main(String[] args) {
        String[] survey = {"AN","CF","MJ","RT","NA"};
        int[] choices = {5,3,2,7,5};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);

        for(int i=0;i<survey.length;i++){
            char disagree = survey[i].charAt(0);
            char agree = survey[i].charAt(1);

            int seq = choices[i];
            switch (seq){
                case 1 :
                    map.put(disagree, map.get(disagree)+3);
                    break;
                case 2 :
                    map.put(disagree, map.get(disagree)+2);
                    break;
                case 3 :
                    map.put(disagree, map.get(disagree)+1);
                    break;
                case 5 :
                    map.put(agree, map.get(agree)+1);
                    break;
                case 6 :
                    map.put(agree, map.get(agree)+2);
                    break;
                case 7 :
                    map.put(agree, map.get(agree)+3);
                    break;
                default :
                    break;
            }

        }

        StringBuilder sb = new StringBuilder();
        if(map.get('R')==map.get('T')) sb.append('R');
        else if(map.get('R')<map.get('T')) sb.append('T');
        else sb.append('R');

        if(map.get('C')==map.get('F')) sb.append('C');
        else if(map.get('C')<map.get('F')) sb.append('F');
        else sb.append('C');

        if(map.get('J')==map.get('M')) sb.append('J');
        else if(map.get('J')<map.get('M')) sb.append('M');
        else sb.append('J');

        if(map.get('A')==map.get('N')) sb.append('A');
        else if(map.get('A')<map.get('N')) sb.append('N');
        else sb.append('A');

        System.out.println(sb);
    }
}
