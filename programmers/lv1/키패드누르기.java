package lv1;


class 키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        System.out.println(solution(numbers,hand));
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int leftLocation = 10;
        int rightLocation = 12;
        int leftDistance = 0;
        int rightDistance = 0;

        for (int number : numbers) {
            if ((number - 1) % 3 == 0) {
                answer.append("L");
                leftLocation = number;
            } else if (number % 3 == 0 && number!=0) {
                answer.append("R");
                rightLocation = number;
            } else {
                leftDistance = getDistance(leftLocation, number);
                rightDistance = getDistance(rightLocation, number);

                if (leftDistance > rightDistance) {
                    answer.append("R");
                    rightLocation = number;
                } else if (leftDistance < rightDistance) {
                    answer.append("L");
                    leftLocation = number;
                } else {
                    if (hand.equals("right")) {
                        answer.append("R");
                        rightLocation = number;
                    } else {
                        answer.append("L");
                        leftLocation = number;
                    }
                }
            }
        }
        return answer.toString();
    }

    public static int getDistance(int location, int number){
        if(number == 0) number = 11;
        if(location == 0) location = 11;

        int targetX = (number-1)/3;
        int targetY = (number-1)%3;
        int locationX = (location-1)/3;
        int locationY = (location-1)%3;

        return Math.abs(targetX-locationX) + Math.abs(targetY-locationY);
    }
}