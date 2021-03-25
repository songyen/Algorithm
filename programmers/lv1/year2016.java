package lv1;

import java.time.LocalDate;

public class year2016 {
    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
    public static String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
        String day = date.getDayOfWeek().toString();
        return day.substring(0,3);
    }
}
