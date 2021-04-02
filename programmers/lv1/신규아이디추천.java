package lv1;

public class 신규아이디추천 {
    public static void main(String[] args) {
        String name = "new-....id";
        String newName = name.replaceAll("[.]{2,}",".");
        System.out.println(newName);
    }
    public static String solution(String new_id) {
        if(!new_id.equals(new_id.toLowerCase())) new_id = new_id.toLowerCase(); //1단계
        if(!new_id.matches("^[a-z0-9_.-]*$")) new_id = new_id.replaceAll("^[^a-z0-9_.-]*$",""); //2단계
        if(new_id.matches("[.]{2,}")) new_id = new_id.replaceAll("[.]{2,}","."); //3단계
        if(new_id.matches("^[.]*$")) new_id = new_id.replaceAll("^[.]*$",""); //4단계 . 처음에 위치하면 제거
        if(new_id.matches("^*[.]$")) new_id = new_id.replaceAll("^*[.]$",""); //4단계 . 끝에 위치하면 제거
        if(new_id.isEmpty()) new_id = "a"; //5단계
        if(new_id.length() > 15){  //6단계
            new_id = new_id.substring(1,16);
            if(new_id.matches("^*[.]$")) new_id = new_id.replaceAll("^*[.]$","");
        }
        if(new_id.length() < 3){
            char lastChar = new_id.charAt(new_id.length()-1);
            while(new_id.length() != 3) {
                new_id += lastChar;
            }
        }
        return new_id;
    }
}
