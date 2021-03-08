package lv1;

import java.util.Scanner;

class 키패드누르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        System.out.println(solution(numbers,hand));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keypad = {{1,2,3},
                {4,5,6},
                {7,8,9},
                {10,0,11}};
        int leftX = 3, leftY = 0;
        int rightX =  3, rightY = 2;
        int press = 0;
        int x = 0;
        int y = 0;

        while(press!=numbers.length){
            Loop1:
            for(int i=0;i<4;i++){
                Loop2:
                for(int j=0;j<3;j++){
                    if(keypad[i][j] == numbers[press]) {
                        if ((numbers[press] - 1) % 3 == 0) {
                            //왼손
                            answer += "L";
                            leftX = i;
                            leftY = j;
                            break Loop1;
                        } else if (numbers[press] % 3 == 0 && numbers[press]!=0) { //3 6 9
                            //오른손
                            answer += "R";
                            rightX = i;
                            rightY = j;
                            break Loop1;
                        } else {
                            x = i;
                            y = j;

                            if (Math.abs(leftX - x) + Math.abs(leftY - y) > Math.abs(rightX - x) + Math.abs(rightY - y)) {
                                //오른손
                                answer += "R";
                                rightX = x;
                                rightY = y;
                                break Loop1;
                            } else if (Math.abs(leftX - x) + Math.abs(leftY - y) < Math.abs(rightX - x) + Math.abs(rightY - y)) {
                                //왼손
                                answer += "L";
                                leftX = x;
                                leftY = y;
                                break Loop1;
                            } else {
                                if (hand.equals("right")) {
                                    //오른손잡이
                                    answer += "R";
                                    rightX = x;
                                    rightY = y;
                                    break Loop1;
                                } else {
                                    //왼손잡이
                                    answer += "L";
                                    leftX = x;
                                    leftY = y;
                                    break Loop1;
                                }
                            }
                        }
                    }
                }
            }
            press++;
        }

        return answer;
    }
}