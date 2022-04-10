package lv1;

import java.util.ArrayList;
import java.util.HashSet;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        ArrayList<String> idList = new ArrayList<>();
        for(String id : id_list){
            idList.add(id);
        }
        HashSet[] set = new HashSet[id_list.length];
        for(int i=0;i<id_list.length;i++){
            set[i] = new HashSet<String>();
        }

        for(int i=0;i<report.length;i++){
            String userId = report[i].split(" ")[0];//신고한 이용자 id
            String reportedId = report[i].split(" ")[1];//신고당한 이용자 id
            set[idList.indexOf(reportedId)].add(userId);
        }

        for(int i=0;i<set.length;i++){
            if(set[i].size()>=k){
                for(Object userId : set[i]){
                    answer[idList.indexOf((String)userId)]++;
                }
            }
        }
        return answer;
    }
}
