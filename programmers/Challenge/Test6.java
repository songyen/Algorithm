package Challenge;


import java.util.*;

public class Test6 {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("/a");
//        list.add("/a/b");
//        list.add("/a/b/c");
//        String from = "/a/b";
//        String to = "/";
//        String to2 = "/root/tmp";
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).startsWith(from)){
//                String[] cpPath = from.split("/");
//                String path = cpPath[cpPath.length-1];
//                if(to2.charAt(to2.length()-1)=='/') list.add(to2+list.get(i).substring(list.get(i).indexOf(path)));
//                else list.add(to2+"/"+list.get(i).substring(list.get(i).indexOf(path)));
//            }
//        }
//        for(String s : list) System.out.println(s);
//        String[] input = "300 5 31\n231 300 26\n44 52 1\n168 256 16\n225 242 5\n16 24 1".split("\n");
        String[] input = "200 2 5\n100 150 10\n110 150 15".split("\n");
        HashMap<Integer, Integer> map = new HashMap<>();

        int N, D = 0;
        for(int i=0;i<input.length;i++){
            if(i==0){
                String[] first = input[0].split(" ");
                N = Integer.parseInt(first[0]);
                D = Integer.parseInt(first[2]);
            }else{
                String[] rule = input[i].split(" ");
                int A = Integer.parseInt(rule[0]);
                int B = Integer.parseInt(rule[1]);
                int C = Integer.parseInt(rule[2]);
                for(int j=A;j<=B;j+=C){//100 ~150 10개 간격으로
                    map.put(j, map.getOrDefault(j, 0)+1);

                }
            }
        }
        List<Locker> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new Locker(entry.getKey(), entry.getValue()));
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.index));
        int stone = 0;
        for(Locker locker : list){
            stone += locker.stone;
            if(D==stone){
                System.out.println(locker.index);
            }
        }
    }
    public static class Locker{
        private int index;
        private int stone;

        public Locker(int i, int s){
            index = i;
            stone = s;
        }
    }
}
