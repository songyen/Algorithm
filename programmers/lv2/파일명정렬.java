package lv2;

import java.util.Arrays;
import java.util.Comparator;

public class 파일명정렬 {
    public static void main(String[] args) {
        for(String s: solution(new String[]{"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})){
            System.out.print(s+" ");
        }
    }
    public static String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1Header = o1.split("[0-9]+")[0];
                String o2Header = o2.split("[0-9]+")[0];

                if(o1Header.equalsIgnoreCase(o2Header)){
                    int o1Number = Integer.parseInt(o1.split("[a-zA-Z\\s.-]+")[1]);
                    int o2Number = Integer.parseInt(o2.split("[a-zA-Z\\s.-]+")[1]);
                    if(o1Number > o2Number) return 1;
                    else if(o1Number == o2Number) return 0;
                    else return -1;
                }else return o1Header.compareToIgnoreCase(o2Header);
            }
        });

        return files;
    }
}
