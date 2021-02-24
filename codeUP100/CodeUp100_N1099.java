/*
 *Date : 2021-02-24
 *URL : https://codeup.kr/problem.php?id=1099
 */
import java.util.Scanner;

public class CodeUp100_N1099 {
    public static void main(String[] args) {
        //미로입력
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //개미움직임
        int x=1,y=1;
        while(true){
            if(arr[x][y]==2) {
                arr[x][y]=9;
                break;
            }
            else{
                arr[x][y]=9;
                if(arr[x][y+1]==0){
                    y++;
                }else{
                    if(arr[x+1][y]==1){
                        break;
                    }else{
                        x++;
                    }
                }
            }
        }
        sc.close();

        //움직인 경로출력
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(arr[i][j]+" ");;
            }
            System.out.println();
        }
    }
}
