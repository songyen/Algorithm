package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 달팽이는올라가고싶다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        br.close();
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int v = Integer.parseInt(arr[2]);
        int day = (int) Math.ceil((double)(v-b)/(a-b));
        System.out.println(day);
    }
}
