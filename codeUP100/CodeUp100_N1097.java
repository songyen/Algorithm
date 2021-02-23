/*
 *Date : 2021-02-23
 *URL : https://codeup.kr/problem.php?id=1097
 */
import java.util.Scanner;

public class CodeUp100_N1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        //바둑알 입력
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //십자변환
        int change = sc.nextInt();
        for(int i=0;i<change;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                if (arr[x - 1][j] == 0) {
                    arr[x - 1][j] = 1;
                } else {
                    arr[x - 1][j] = 0;
                }
            }
            for (int j = 0; j < 19; j++) {
                if (arr[j][y-1] == 0) {
                    arr[j][y-1] = 1;
                } else {
                    arr[j][y-1] = 0;
                }
            }
        }
        sc.close();

        //바둑알 출력
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}