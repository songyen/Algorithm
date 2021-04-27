package lv2;

import java.util.*;

public class 오픈채팅방 {
    public static void main(String[] args) {
        for(String s: solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})){
            System.out.println(s);
        }
    }
    public static String[] solution(String[] record) {
        List<String> list = new ArrayList<>();
        Map<String,String> userInfo = new HashMap<>();
        String command, userId, userName;
        for(int i=0;i<record.length;i++){
            command = record[i].split(" ")[0];
            userId = record[i].split(" ")[1];

            if(command.equals("Enter")){
                userName = record[i].split(" ")[2];
                userInfo.put(userId,userName);
                list.add(userId+"님이 들어왔습니다.");
            }else if(command.equals("Leave")){
                list.add(userId+"님이 나갔습니다.");
            }else{
                userName = record[i].split(" ")[2];
                userInfo.put(userId,userName);
            }
        }

        String[] answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            userId = list.get(i).split("[^a-zA-Z0-9]")[0];
            answer[i] = list.get(i).replace(userId, userInfo.get(userId));
        }
        return answer;
    }
}
