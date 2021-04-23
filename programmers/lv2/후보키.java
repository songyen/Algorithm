package lv2;

import java.util.*;

public class 후보키 {
    public static void main(String[] args) {
        후보키 test = new 후보키();
        System.out.println(test.solution(new String[][]{{"100","ryan","music","2"},{"200","apeach","math","2"},
                                                        {"300","tube","computer","3"},{"400","con","computer","4"},
                                                        {"500","muzi","music","3"}, {"600","apeach","music","2"}}));
    }

    private int colSize;
    private int rolSize;
    private String[][] table;
    private List<Integer> candidateKey;

    public int solution(String[][] relation) {
        colSize = relation[0].length;
        rolSize = relation.length;
        table = relation;
        candidateKey = new ArrayList<>();

        for(int i=0;i<(1<<colSize);i++){
            if(!isUnique(i)) continue;
            if(!isMinimality(i)) continue;

            candidateKey.add(i); //6
        }

        return candidateKey.size();
    }

    private boolean isMinimality(int set) {
        for(Integer key : candidateKey){
            if(candidateKey.contains(set)) return false;
        }

        return true;
    }

    private boolean isUnique(int index) {
        List<Integer> set = makeSet(index); // 1, 2
        HashSet<String> tempColums = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<rolSize;i++){

            for(int j : set){
                sb.append(table[i][j]+" ");
            }

            tempColums.add(sb.toString());
        }

        return tempColums.size() == rolSize;
    }

    private List<Integer> makeSet(int set) {
        List<Integer> keySet = new ArrayList<>();
        int index = 1 << colSize-1;
        for(int i=0;i<colSize;i++){
            if((set & index>>i) != 1) keySet.add(i);
        }

        return keySet;
    }

}
