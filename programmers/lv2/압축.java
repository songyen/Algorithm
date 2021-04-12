package lv2;

import java.util.*;

public class 압축 {
    public static void main(String[] args) {
        for(int i : solution("KAKAO")){
            System.out.println(i+", ");
        }
    }
    public static int[] solution(String msg) {
        msg += " ";
        List<String> index = new ArrayList<>();

        for(char i='A';i<='Z';i++){
            index.add(String.valueOf(i));
        }

        Stack<String> stack = new Stack<>();
        for(int i=msg.length()-1;i>=0;i--){
            stack.push(Character.toString(msg.charAt(i)));
        }

        List<Integer> output = new ArrayList<>();
        String w = "";
        String c = "";
        while(!stack.peek().equals(" ")){
            w = stack.pop();
            if(stack.peek().equals(" ")) {
                output.add(index.indexOf(w));
                break;
            }
            else c = stack.peek();

            while(index.contains(w+c)){
                w += c;
                stack.pop();
                if(stack.peek().equals(" ")){
                    c = "";
                    break;
                }
                else c = stack.peek();
            }

            output.add(index.indexOf(w));
            index.add(w+c);
        }

        int[] answer = new int[output.size()];
        for(int i=0;i<output.size();i++){
            answer[i] = output.get(i);
        }

        return answer;
    }
}
