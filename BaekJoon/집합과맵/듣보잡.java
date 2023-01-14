package 집합과맵;

import java.io.IOException;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String name = sc.next();
            map.put(name, map.getOrDefault(name,0)+1);
        }
        for(int i=0;i<m;i++){
            String name = sc.next();
            map.put(name, map.getOrDefault(name,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key)>1) list.add(key);
        }
        System.out.println(list.size());
        Collections.sort(list);
        for(int i=0;i<list.size();i++) System.out.println(list.get(i));
    }
}

