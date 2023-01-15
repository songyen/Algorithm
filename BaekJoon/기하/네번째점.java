package 기하;

import java.util.Scanner;

public class 네번째점 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Point[] arr = new Point[3];
        for(int i=0;i<3;i++){
            arr[i] = new Point(sc.nextInt(),sc.nextInt());
        }
        int x = 0;
        int y = 0;
        if(arr[0].x == arr[1].x) x = arr[2].x;
        else if(arr[0].x == arr[2].x) x = arr[1].x;
        else x = arr[0].x;

        if(arr[0].y == arr[1].y) y = arr[2].y;
        else if(arr[0].y == arr[2].y) y = arr[1].y;
        else y = arr[0].y;

        System.out.println(x+" "+y);
    }
    public static class Point{
        private int x;
        private int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}

