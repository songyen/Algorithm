package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 나머지 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[42];
        for (int i = 0; i < 10; i++) {
            array[Integer.parseInt(br.readLine()) % 42]++;
        }
        br.close();
        int result = 0;
        for (int i : array) {
            if (i != 0) result++;
        }
        System.out.println(result);
    }
}
