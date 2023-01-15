package 기하;

import java.util.Scanner;

public class 직사각형에서탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        minX = Math.min(w-x, x-0);
        minY = Math.min(h-y, y-0);

        System.out.println(Math.min(minX, minY));
    }
}
