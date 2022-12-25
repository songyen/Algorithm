package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] person = new Person[n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            person[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                else{
                    //System.out.println(person[i].weight+","+person[i].height);
                    //System.out.println(person[j].weight+","+person[j].height);
                    if ((person[i].height < person[j].height) && (person[i].weight < person[j].weight)) {
                        cnt += 1;
                    }
                }
            }
            sb.append((cnt + 1)+" ");
        }
        System.out.println(sb.toString().trim());
    }

    public static class Person {
        int weight;
        int height;

        public Person(int w, int h) {
            weight = w;
            height = h;
        }
    }
}

